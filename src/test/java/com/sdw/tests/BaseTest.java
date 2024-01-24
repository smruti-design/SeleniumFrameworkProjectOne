package com.sdw.tests;

import org.openqa.selenium.By;

import com.sdw.driver.DriverManager;

public class BaseTest {
	
	protected void click(By by) {
		DriverManager.getDriver().findElement(by).click();
	}
	
	protected void sendKeys(By by, String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}
	
	

}
