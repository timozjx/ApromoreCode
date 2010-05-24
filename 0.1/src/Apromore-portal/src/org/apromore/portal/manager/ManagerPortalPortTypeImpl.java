
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.apromore.portal.manager;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.7
 * Mon May 24 15:49:43 EST 2010
 * Generated source version: 2.2.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "ManagerPortalService",
                      portName = "ManagerPortal",
                      targetNamespace = "http://www.apromore.org/manager/service_portal",
                      wsdlLocation = "http://localhost:8080/Apromore-manager/services/ManagerPortal?wsdl",
                      endpointInterface = "org.apromore.portal.manager.ManagerPortalPortType")
                      
public class ManagerPortalPortTypeImpl implements ManagerPortalPortType {

    private static final Logger LOG = Logger.getLogger(ManagerPortalPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see org.apromore.portal.manager.ManagerPortalPortType#exportNative(org.apromore.portal.model_manager.ExportNativeInputMsgType  payload )*
     */
    public org.apromore.portal.model_manager.ExportNativeOutputMsgType exportNative(org.apromore.portal.model_manager.ExportNativeInputMsgType payload) { 
        LOG.info("Executing operation exportNative");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.ExportNativeOutputMsgType _return = new org.apromore.portal.model_manager.ExportNativeOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message2133890402");
            _returnResult.setCode(Integer.valueOf(859060525));
            _return.setResult(_returnResult);
            javax.activation.DataHandler _returnNative = null;
            _return.setNative(_returnNative);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.apromore.portal.manager.ManagerPortalPortType#writeUser(org.apromore.portal.model_manager.WriteUserInputMsgType  payload )*
     */
    public org.apromore.portal.model_manager.WriteUserOutputMsgType writeUser(org.apromore.portal.model_manager.WriteUserInputMsgType payload) { 
        LOG.info("Executing operation writeUser");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.WriteUserOutputMsgType _return = new org.apromore.portal.model_manager.WriteUserOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message1849492634");
            _returnResult.setCode(Integer.valueOf(461383082));
            _return.setResult(_returnResult);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public org.apromore.portal.model_manager.WriteEditSessionOutputMsgType writeEditSession(org.apromore.portal.model_manager.WriteEditSessionInputMsgType payload) { 
        LOG.info("Executing operation writeEditSession");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.WriteEditSessionOutputMsgType _return = new org.apromore.portal.model_manager.WriteEditSessionOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message-1495194769");
            _returnResult.setCode(Integer.valueOf(1900148059));
            _return.setResult(_returnResult);
            _return.setEditSessionCode(Integer.valueOf(-1927945224));
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

	/* (non-Javadoc)
     * @see org.apromore.portal.manager.ManagerPortalPortType#readFormats(org.apromore.portal.model_manager.ReadFormatsInputMsgType  payload )*
     */
    public org.apromore.portal.model_manager.ReadFormatsOutputMsgType readFormats(org.apromore.portal.model_manager.ReadFormatsInputMsgType payload) { 
        LOG.info("Executing operation readFormats");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.ReadFormatsOutputMsgType _return = new org.apromore.portal.model_manager.ReadFormatsOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message195736851");
            _returnResult.setCode(Integer.valueOf(534319375));
            _return.setResult(_returnResult);
            org.apromore.portal.model_manager.FormatsType _returnFormats = new org.apromore.portal.model_manager.FormatsType();
            java.util.List<java.lang.String> _returnFormatsFormat = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnFormatsFormatVal1 = "_returnFormatsFormatVal1622692132";
            _returnFormatsFormat.add(_returnFormatsFormatVal1);
            _returnFormats.getFormat().addAll(_returnFormatsFormat);
            _return.setFormats(_returnFormats);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.apromore.portal.manager.ManagerPortalPortType#readDomains(org.apromore.portal.model_manager.ReadDomainsInputMsgType  payload )*
     */
    public org.apromore.portal.model_manager.ReadDomainsOutputMsgType readDomains(org.apromore.portal.model_manager.ReadDomainsInputMsgType payload) { 
        LOG.info("Executing operation readDomains");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.ReadDomainsOutputMsgType _return = new org.apromore.portal.model_manager.ReadDomainsOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message-1397366467");
            _returnResult.setCode(Integer.valueOf(-498776411));
            _return.setResult(_returnResult);
            org.apromore.portal.model_manager.DomainsType _returnDomains = new org.apromore.portal.model_manager.DomainsType();
            java.util.List<java.lang.String> _returnDomainsDomain = new java.util.ArrayList<java.lang.String>();
            java.lang.String _returnDomainsDomainVal1 = "_returnDomainsDomainVal-1975641996";
            _returnDomainsDomain.add(_returnDomainsDomainVal1);
            _returnDomains.getDomain().addAll(_returnDomainsDomain);
            _return.setDomains(_returnDomains);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.apromore.portal.manager.ManagerPortalPortType#readUser(org.apromore.portal.model_manager.ReadUserInputMsgType  payload )*
     */
    public org.apromore.portal.model_manager.ReadUserOutputMsgType readUser(org.apromore.portal.model_manager.ReadUserInputMsgType payload) { 
        LOG.info("Executing operation readUser");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.ReadUserOutputMsgType _return = new org.apromore.portal.model_manager.ReadUserOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message693620499");
            _returnResult.setCode(Integer.valueOf(-1326281172));
            _return.setResult(_returnResult);
            org.apromore.portal.model_manager.UserType _returnUser = new org.apromore.portal.model_manager.UserType();
            java.util.List<org.apromore.portal.model_manager.SearchHistoriesType> _returnUserSearchHistories = new java.util.ArrayList<org.apromore.portal.model_manager.SearchHistoriesType>();
            org.apromore.portal.model_manager.SearchHistoriesType _returnUserSearchHistoriesVal1 = new org.apromore.portal.model_manager.SearchHistoriesType();
            _returnUserSearchHistoriesVal1.setSearch("Search894668902");
            _returnUserSearchHistoriesVal1.setNum(Integer.valueOf(613796611));
            _returnUserSearchHistories.add(_returnUserSearchHistoriesVal1);
            _returnUser.getSearchHistories().addAll(_returnUserSearchHistories);
            _returnUser.setFirstname("Firstname-169021280");
            _returnUser.setLastname("Lastname-1579957905");
            _returnUser.setEmail("Email975815866");
            _returnUser.setUsername("Username1129738305");
            _returnUser.setPasswd("Passwd-1066176859");
            _return.setUser(_returnUser);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public org.apromore.portal.model_manager.DeleteEditSessionOutputMsgType deleteEditSession(org.apromore.portal.model_manager.DeleteEditSessionInputMsgType payload) { 
        LOG.info("Executing operation deleteEditSession");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.DeleteEditSessionOutputMsgType _return = new org.apromore.portal.model_manager.DeleteEditSessionOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message-932678681");
            _returnResult.setCode(Integer.valueOf(204220527));
            _return.setResult(_returnResult);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

	/* (non-Javadoc)
     * @see org.apromore.portal.manager.ManagerPortalPortType#importProcess(org.apromore.portal.model_manager.ImportProcessInputMsgType  payload )*
     */
    public org.apromore.portal.model_manager.ImportProcessOutputMsgType importProcess(org.apromore.portal.model_manager.ImportProcessInputMsgType payload) { 
        LOG.info("Executing operation importProcess");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.ImportProcessOutputMsgType _return = new org.apromore.portal.model_manager.ImportProcessOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message-1484886319");
            _returnResult.setCode(Integer.valueOf(1012910355));
            _return.setResult(_returnResult);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.apromore.portal.manager.ManagerPortalPortType#readProcessSummaries(org.apromore.portal.model_manager.ReadProcessSummariesInputMsgType  payload )*
     */
    public org.apromore.portal.model_manager.ReadProcessSummariesOutputMsgType readProcessSummaries(org.apromore.portal.model_manager.ReadProcessSummariesInputMsgType payload) { 
        LOG.info("Executing operation readProcessSummaries");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.ReadProcessSummariesOutputMsgType _return = new org.apromore.portal.model_manager.ReadProcessSummariesOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message-18570255");
            _returnResult.setCode(Integer.valueOf(-750557718));
            _return.setResult(_returnResult);
            org.apromore.portal.model_manager.ProcessSummariesType _returnProcessSummaries = new org.apromore.portal.model_manager.ProcessSummariesType();
            java.util.List<org.apromore.portal.model_manager.ProcessSummaryType> _returnProcessSummariesProcessSummary = new java.util.ArrayList<org.apromore.portal.model_manager.ProcessSummaryType>();
            org.apromore.portal.model_manager.ProcessSummaryType _returnProcessSummariesProcessSummaryVal1 = new org.apromore.portal.model_manager.ProcessSummaryType();
            java.util.List<org.apromore.portal.model_manager.VersionSummaryType> _returnProcessSummariesProcessSummaryVal1VersionSummaries = new java.util.ArrayList<org.apromore.portal.model_manager.VersionSummaryType>();
            _returnProcessSummariesProcessSummaryVal1.getVersionSummaries().addAll(_returnProcessSummariesProcessSummaryVal1VersionSummaries);
            _returnProcessSummariesProcessSummaryVal1.setOriginalNativeType("OriginalNativeType305410061");
            _returnProcessSummariesProcessSummaryVal1.setName("Name-203057054");
            _returnProcessSummariesProcessSummaryVal1.setId(Integer.valueOf(-2092613678));
            _returnProcessSummariesProcessSummaryVal1.setDomain("Domain-1512465980");
            _returnProcessSummariesProcessSummaryVal1.setRanking(Integer.valueOf(2000948938));
            _returnProcessSummariesProcessSummaryVal1.setLastVersion("LastVersion838481792");
            _returnProcessSummariesProcessSummary.add(_returnProcessSummariesProcessSummaryVal1);
            _returnProcessSummaries.getProcessSummary().addAll(_returnProcessSummariesProcessSummary);
            _return.setProcessSummaries(_returnProcessSummaries);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

	public org.apromore.portal.model_manager.ReadEditSessionOutputMsgType readEditSession(org.apromore.portal.model_manager.ReadEditSessionInputMsgType payload) { 
        LOG.info("Executing operation readEditSession");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.ReadEditSessionOutputMsgType _return = new org.apromore.portal.model_manager.ReadEditSessionOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message-1764161578");
            _returnResult.setCode(Integer.valueOf(812254020));
            _return.setResult(_returnResult);
            javax.activation.DataHandler _returnNative = null;
            _return.setNative(_returnNative);
            org.apromore.portal.model_manager.EditSessionType _returnEditSession = new org.apromore.portal.model_manager.EditSessionType();
            _returnEditSession.setUsername("Username-698083987");
            _returnEditSession.setNativeType("NativeType-310117155");
            _returnEditSession.setProcessId(Integer.valueOf(1001352149));
            _returnEditSession.setVersionName("VersionName2073865261");
            _return.setEditSession(_returnEditSession);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

	public org.apromore.portal.model_manager.UpdateProcessOutputMsgType updateProcess(org.apromore.portal.model_manager.UpdateProcessInputMsgType payload) { 
        LOG.info("Executing operation updateProcess");
        System.out.println(payload);
        try {
            org.apromore.portal.model_manager.UpdateProcessOutputMsgType _return = new org.apromore.portal.model_manager.UpdateProcessOutputMsgType();
            org.apromore.portal.model_manager.ResultType _returnResult = new org.apromore.portal.model_manager.ResultType();
            _returnResult.setMessage("Message1983488474");
            _returnResult.setCode(Integer.valueOf(1155758607));
            _return.setResult(_returnResult);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
