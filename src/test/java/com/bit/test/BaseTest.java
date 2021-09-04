package com.bit.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {

	@Parameters({"browser", "url"})
	@BeforeMethod(groups = "forntend")
	public void beforeMethod(String b, String e) {
		if (b.equalsIgnoreCase("chrome")) {
//			open the browser
		} else {
// 			sudo code
		}
		
		
		

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suit");
		
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suit");
	}

}
