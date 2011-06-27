package com.company.auth.client;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {
	public static void main(String[] args) {
		WSDLToJava.main(new String[] { "-client", "-d", "src/",
				"http://localhost:8080/CXFWebExample/services/cxfAuth?wsdl" });
		System.out.println("Done!");
	}
}
