package com.bit.test;

import org.testng.annotations.Test;

import com.bit.DB.DataDriven;

public class DBtest {

	
	  @Test(dataProvider = "login", dataProviderClass = DataDriven.class , description = "this is for data driven", alwaysRun = true) 
	  public void f(String n, String s) {
		  System.out.println(n);
		  System.out.println(s);
	  
	  }
	 

}
