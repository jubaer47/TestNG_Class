package com.bit.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{
		
	@Test(groups = "frontend")
	public void logout() {
		System.out.println("logout");
		Reporter.log("test1");
	}

}
