package com.sdw.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.sdw.driver.Driver;
import com.sdw.driver.DriverManager;

public class Home extends BaseClass {

	private Home() {

	}

	@Test
	public void test1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("google", Keys.ENTER);
	}
	
	@Test
	public void test2() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("faang", Keys.ENTER);
	}
}
