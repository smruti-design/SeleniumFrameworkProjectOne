package com.sdw.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.sdw.driver.Driver;
import com.sdw.driver.DriverManager;

public final class LoginClass extends BaseClass{
	
	private LoginClass(){
		
	}
	
	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("cognizant",Keys.ENTER);
	}
}
