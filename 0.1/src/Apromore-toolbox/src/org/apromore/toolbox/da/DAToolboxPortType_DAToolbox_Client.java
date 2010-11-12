
package org.apromore.toolbox.da;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.9
 * Fri Nov 12 09:16:34 CET 2010
 * Generated source version: 2.2.9
 * 
 */

public final class DAToolboxPortType_DAToolbox_Client {

    private static final QName SERVICE_NAME = new QName("http://www.apromore.org/data_access/service_toolbox", "DAToolboxService");

    private DAToolboxPortType_DAToolbox_Client() {
    }

    public static void main(String args[]) throws Exception {
        URL wsdlURL = DAToolboxService.WSDL_LOCATION;
        if (args.length > 0) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DAToolboxService ss = new DAToolboxService(wsdlURL, SERVICE_NAME);
        DAToolboxPortType port = ss.getDAToolbox();  
        
        {
        System.out.println("Invoking readCanonicals...");
        org.apromore.toolbox.model_da.ReadCanonicalsInputMsgType _readCanonicals_payload = new org.apromore.toolbox.model_da.ReadCanonicalsInputMsgType();
        _readCanonicals_payload.setEmpty("Empty-1756383585");
        org.apromore.toolbox.model_da.ReadCanonicalsOutputMsgType _readCanonicals__return = port.readCanonicals(_readCanonicals_payload);
        System.out.println("readCanonicals.result=" + _readCanonicals__return);


        }
        {
        System.out.println("Invoking storeCpf...");
        org.apromore.toolbox.model_da.StoreCpfInputMsgType _storeCpf_payload = new org.apromore.toolbox.model_da.StoreCpfInputMsgType();
        _storeCpf_payload.setProcessName("ProcessName1449250523");
        _storeCpf_payload.setVersion("Version-2075273429");
        _storeCpf_payload.setUsername("Username-128515079");
        javax.activation.DataHandler _storeCpf_payloadCpf = null;
        _storeCpf_payload.setCpf(_storeCpf_payloadCpf);
        org.apromore.toolbox.model_da.StoreCpfOutputMsgType _storeCpf__return = port.storeCpf(_storeCpf_payload);
        System.out.println("storeCpf.result=" + _storeCpf__return);


        }

        System.exit(0);
    }

}
