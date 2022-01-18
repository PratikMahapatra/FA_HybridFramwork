package com.mindtree.manager;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ConfigReader;
import utility.Logs;

public class WebDriverManager {

	public  static WebDriver driver;
	public  Properties properties;
	ConfigReader configReader;
	Logs logUtil;
	Logger log;

	public WebDriverManager() {
		configReader = new ConfigReader();
		properties = configReader.getProperties();
		logUtil = new Logs();
	}

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", properties.getProperty("driverpath"));
		driver = new ChromeDriver();
		log = logUtil.createLog("BaseClass.class");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		if (driver == null) {
			log.fatal("Driver not found");
		}
		return driver;
	}

}
