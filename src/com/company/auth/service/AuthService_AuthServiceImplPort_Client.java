
package com.company.auth.service;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-06-26T23:02:54.725+02:00
 * Generated source version: 2.4.1
 * 
 */
public final class AuthService_AuthServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://service.auth.company.com/", "corporateAuthService");

    private AuthService_AuthServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CorporateAuthService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
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
      
        CorporateAuthService ss = new CorporateAuthService(wsdlURL, SERVICE_NAME);
        AuthService port = ss.getAuthServiceImplPort();  
        
        {
        System.out.println("Invoking getEmployee...");
        java.lang.String _getEmployee_gid = "";
        com.company.auth.service.Employee _getEmployee__return = port.getEmployee(_getEmployee_gid);
        System.out.println("getEmployee.result=" + _getEmployee__return);


        }

        System.exit(0);
    }

}