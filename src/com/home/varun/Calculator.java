package com.home.varun;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


/* This is a program written to print a country name of any provided IP address. I pinged google.com and got its ip address as 64.233.177.113 
 * Source:javaBrains.com
 * This program is intended to demonstrate client side of the Webservice
 * I imported all the geop classes by using wsimport in command prompt for WSDL URL:http://www.webservicex.net/geoipservice.asmx?WSDL
 * */
@WebService
public class Calculator {
	@WebMethod
	public int add(int a, int b)
	{
		return a+b;
	}
	
}
