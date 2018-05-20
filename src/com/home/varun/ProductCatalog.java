package com.home.varun;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;


/* This is a program written to print a country name of any provided IP address. I pinged google.com and got its ip address as 64.233.177.113 
 * Source:javaBrains.com
 * This program is intended to demonstrate client side of the Webservice
 * I imported all the geop classes by using wsimport in command prompt for WSDL URL:http://www.webservicex.net/geoipservice.asmx?WSDL
 * */
@WebService
public class ProductCatalog {
		
		@WebMethod
	  public List<String> getProductCategories(String client) {
			
		  List<String> productCategories=new ArrayList<String>();
		  productCategories.add("Books");
		  productCategories.add("food");
		  productCategories.add("clothes");
		  if(!client.equalsIgnoreCase("test")){
			  productCategories=new ArrayList<String>();
		  }
		  return productCategories;
		  }
}
