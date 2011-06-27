package com.company.auth.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.1
 * 2011-06-26T23:02:54.775+02:00
 * Generated source version: 2.4.1
 * 
 */
@WebService(targetNamespace = "http://service.auth.company.com/", name = "AuthService")
@XmlSeeAlso({ObjectFactory.class})
public interface AuthService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getEmployee", targetNamespace = "http://service.auth.company.com/", className = "com.company.auth.service.GetEmployee")
    @WebMethod
    @ResponseWrapper(localName = "getEmployeeResponse", targetNamespace = "http://service.auth.company.com/", className = "com.company.auth.service.GetEmployeeResponse")
    public com.company.auth.service.Employee getEmployee(
        @WebParam(name = "gid", targetNamespace = "")
        java.lang.String gid
    );
}