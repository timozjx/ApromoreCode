package org.apromore.manager.canoniser;

import java.io.IOException;
import java.io.InputStream;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.util.ByteArrayDataSource;

import org.apromore.canoniser.service.CanoniserManager;
import org.apromore.exception.ExceptionCanoniseVersion;
import org.apromore.exception.ExceptionGenerateAnnotation;
import org.apromore.exception.ExceptionVersion;
import org.apromore.model.CanoniseVersionInputMsgType;
import org.apromore.model.CanoniseVersionOutputMsgType;
import org.apromore.model.EditSessionType;
import org.apromore.model.GenerateAnnotationInputMsgType;
import org.apromore.model.GenerateAnnotationOutputMsgType;

public class ManagerCanoniserClient {

    private CanoniserManager manager;

    public void CanoniseVersion(Integer editSessionCode, EditSessionType editSession, String cpfURI,
                                InputStream native_is) throws IOException, ExceptionCanoniseVersion, ExceptionVersion {
        CanoniseVersionInputMsgType payload = new CanoniseVersionInputMsgType();
        DataSource source = new ByteArrayDataSource(native_is, "text/xml");
        payload.setEditSessionCode(editSessionCode);
        payload.setNative(new DataHandler(source));
        payload.setEditSession(editSession);
        payload.setCpfUri(cpfURI);
        // send request to canoniser
        CanoniseVersionOutputMsgType res = manager.canoniseVersion(payload);
        if (res.getResult().getCode() == -1) {
            throw new ExceptionCanoniseVersion(res.getResult().getMessage());
        } else if (res.getResult().getCode() == -3) {
            throw new ExceptionVersion(res.getResult().getMessage());
        }
    }

    public void GenerateAnnotation(String annotName, Integer editSessionCode,
                                   Boolean isNew, Integer processId, String version, String nat_type,
                                   InputStream native_is) throws IOException, ExceptionGenerateAnnotation {
        GenerateAnnotationInputMsgType payload = new GenerateAnnotationInputMsgType();
        DataSource source = new ByteArrayDataSource(native_is, "text/xml");
        payload.setEditSessionCode(editSessionCode);
        payload.setNative(new DataHandler(source));
        payload.setIsNew(isNew);
        payload.setAnnotationName(annotName);
        payload.setProcessId(processId);
        payload.setVersion(version);
        payload.setNativeType(nat_type);
        // send request to canoniser
        GenerateAnnotationOutputMsgType res = manager.generateAnnotation(payload);
        if (res.getResult().getCode() == -1) {
            throw new ExceptionGenerateAnnotation(res.getResult().getMessage());
        }
    }


    public void setManager(CanoniserManager manager) {
        this.manager = manager;
    }
}
