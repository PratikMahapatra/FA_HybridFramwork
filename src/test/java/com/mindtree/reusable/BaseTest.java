package com.mindtree.reusable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.mindtree.manager.WebDriverManager;

import utility.Logs;

public class BaseTest extends WebDriverManager {
	 WebDriverManager driverManager;
	WebDriverHelper Helper;
	static Logs loggerUtil;
	static Logger log;
	public static ExtentTest test;

	public void startUp() {
		loggerUtil = new Logs();
		log = loggerUtil.createLog("Hooks.class");
		log.debug("Opening driver");
		driverManager = new WebDriverManager();
		driver= driverManager.getDriver();
		log.info("Driver opened");
		driver.get(properties.getProperty("url"));
		log.debug("Opening URL");
	}

	public  void tearDown() {
		log.info("Driver closed");
		driver.quit();
	}
	public static String getscreenshotpath(String TestCaseName) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String target = (System.getProperty("user.dir") + "/Screenshot/" + TestCaseName+System.currentTimeMillis() + ".png");
		File file=new File(target);
		FileUtils.copyFile(source, file);
		return target;
	}

}
