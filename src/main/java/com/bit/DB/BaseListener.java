package com.bit.DB;

import java.io.IOException;

import javax.naming.Context;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.bit.util.SeleniumHelper;

public class BaseListener implements ITestListener{
	
	

	public void onFinish(ITestContext arg0) {
		System.out.println(arg0.getName());
	}

	public void onStart(ITestContext arg0) {
		System.out.println(arg0.getClass());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println(arg0.getName()+" "+"is failed");
		System.out.println("Screen shot taken!");
		try {
			SeleniumHelper.getScreenShot();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {
		System.out.println(arg0.getName()+" "+"is started");
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println(arg0.getName()+" "+"status is"+" "+arg0.getStatus());
	}
}
