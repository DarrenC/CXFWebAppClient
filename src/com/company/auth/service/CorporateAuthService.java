package com.company.auth.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-06-26T23:02:54.785+02:00
 * Generated source version: 2.4.1
 * 
 */
@WebServiceClient(name = "corporateAuthService", 
                  wsdlLocation = "http://localhost:8080/CXFWebExample/services/cxfAuth?wsdl",
                  targetNamespace = "http://service.auth.company.com/") 
public class CorporateAuthService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.auth.company.com/", "corporateAuthService");
    public final static QName AuthServiceImplPort = new QName("http://service.auth.company.com/", "AuthServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/CXFWebExample/services/cxfAuth?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CorporateAuthService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/CXFWebExample/services/cxfAuth?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CorporateAuthService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CorporateAuthService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CorporateAuthService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns AuthService
     */
    @WebEndpoint(name = "AuthServiceImplPort")
    public AuthService getAuthServiceImplPort() {
        return super.getPort(AuthServiceImplPort, AuthService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthService
     */
    @WebEndpoint(name = "AuthServiceImplPort")
    public AuthService getAuthServiceImplPort(WebServiceFeature... features) {
        return super.getPort(AuthServiceImplPort, AuthService.class, features);
    }

}