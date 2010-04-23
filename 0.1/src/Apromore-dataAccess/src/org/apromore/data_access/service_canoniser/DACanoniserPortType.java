package org.apromore.data_access.service_canoniser;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.7
 * Fri Apr 23 16:18:40 EST 2010
 * Generated source version: 2.2.7
 * 
 */
 
@WebService(targetNamespace = "http://www.apromore.org/data_access/service_canoniser", name = "DACanoniserPortType")
@XmlSeeAlso({org.apromore.anf.ObjectFactory.class,org.apromore.data_access.model_canoniser.ObjectFactory.class,org.apromore.cpf.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DACanoniserPortType {

    @WebResult(name = "StoreNativeCpfOutputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser", partName = "payload")
    @WebMethod(operationName = "StoreNativeCpf")
    public org.apromore.data_access.model_canoniser.StoreNativeCpfOutputMsgType storeNativeCpf(
        @WebParam(partName = "payload", name = "StoreNativeCpfInputMsg", targetNamespace = "http://www.apromore.org/data_access/model_canoniser")
        org.apromore.data_access.model_canoniser.StoreNativeCpfInputMsgType payload
    );
}
