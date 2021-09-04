package com.bit.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UnitTest extends BaseTest{
	
	@Test(groups = "frontend")
	public void buyAShirt() {
		System.out.println("Buy a shirt");
	}
	
	
	@Parameters({"browser"})
	@Test
	public void buyAPant(String b) {
		System.out.println(b);
	}
	
	
	
	

}
