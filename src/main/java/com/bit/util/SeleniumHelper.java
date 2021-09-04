package com.bit.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


public class SeleniumHelper {
	static WebDriver driver;

	public SeleniumHelper(WebDriver driver) {
		this.driver = driver;
		 
	}
	
	public static void getScreenShot() throws IOException {

		int x = (int) Math.random();
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		Files.copy(SrcFile, new File("ScreenShots/shot" + x + ".png"));

	}

}
