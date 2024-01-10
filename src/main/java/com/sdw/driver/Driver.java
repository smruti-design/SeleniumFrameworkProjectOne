package com.sdw.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sdw.constants.FrameworkConstants;

public class Driver {

	private static WebDriver driver;
	
	private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public static void setDriver(WebDriver driveref) {
		dr.set(driveref);
	}

	public static void unload() {
		dr.remove();
	}
	
	public static void initDriver() {
		if (Objects.isNull(driver)) {
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
			driver = new ChromeDriver();
			setDriver(driver);
			getDriver().get("https://www.google.com");
		}
	}

	public static void quitDriver() {
		if(Objects.nonNull(driver)) {
			getDriver().quit();
			unload();
		}
	}
}
