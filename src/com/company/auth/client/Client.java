package com.company.auth.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.company.auth.service.AuthService;
import com.company.auth.service.Employee;

public final class Client {

    private Client() {
    } 

    public static void main(String args[]) throws Exception {

    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

    	factory.getInInterceptors().add(new LoggingInInterceptor());
    	factory.getOutInterceptors().add(new LoggingOutInterceptor());
    	factory.setServiceClass(AuthService.class);
    	factory.setAddress("http://localhost:8080/CXFWebExample/services/cxfAuth");
    	AuthService client = (AuthService) factory.create();

    	Employee employee = client.getEmployee("0223938");
    	System.out.println("Server said: " + employee.getLastName() + ", " + employee.getFirstName());
    	System.out.println("Server said: " + employee.getEmpAddress().getAddressType() + ", " + employee.getEmpAddress().getAddress().getStreetName());
    	System.exit(0);

    }

}