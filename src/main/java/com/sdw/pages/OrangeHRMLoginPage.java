package com.sdw.pages;

import org.openqa.selenium.By;

import com.sdw.driver.DriverManager;

public final class OrangeHRMLoginPage {
	
	private final By username = By.xpath("//*[@name='username']");
	private final By password = By.xpath("//input[@name='password' and @placeholder='Password']");
	private final By login = By.xpath("//button[@type='submit']");
	
	public void enterUsername(String name) {
		DriverManager.getDriver().findElement(username).sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		DriverManager.getDriver().findElement(password).sendKeys(pass);
	}
	
	public void clickLogin() {
		DriverManager.getDriver().findElement(login).click();
	}

}
