
package com.company.auth.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company.auth.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployee_QNAME = new QName("http://service.auth.company.com/", "getEmployee");
    private final static QName _GetPdf_QNAME = new QName("http://service.auth.company.com/", "getPdf");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://service.auth.company.com/", "getEmployeeResponse");
    private final static QName _GetPdfResponse_QNAME = new QName("http://service.auth.company.com/", "getPdfResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company.auth.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPdf }
     * 
     */
    public GetPdf createGetPdf() {
        return new GetPdf();
    }

    /**
     * Create an instance of {@link GetPdfResponse }
     * 
     */
    public GetPdfResponse createGetPdfResponse() {
        return new GetPdfResponse();
    }

    /**
     * Create an instance of {@link GetEmployeeResponse }
     * 
     */
    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    /**
     * Create an instance of {@link GetEmployee }
     * 
     */
    public GetEmployee createGetEmployee() {
        return new GetEmployee();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link EmployeeAddress }
     * 
     */
    public EmployeeAddress createEmployeeAddress() {
        return new EmployeeAddress();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auth.company.com/", name = "getEmployee")
    public JAXBElement<GetEmployee> createGetEmployee(GetEmployee value) {
        return new JAXBElement<GetEmployee>(_GetEmployee_QNAME, GetEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPdf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auth.company.com/", name = "getPdf")
    public JAXBElement<GetPdf> createGetPdf(GetPdf value) {
        return new JAXBElement<GetPdf>(_GetPdf_QNAME, GetPdf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auth.company.com/", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPdfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.auth.company.com/", name = "getPdfResponse")
    public JAXBElement<GetPdfResponse> createGetPdfResponse(GetPdfResponse value) {
        return new JAXBElement<GetPdfResponse>(_GetPdfResponse_QNAME, GetPdfResponse.class, null, value);
    }

}
