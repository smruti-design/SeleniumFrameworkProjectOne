package com.sdw.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.sdw.driver.Driver;

public class Home extends BaseClass {

	private Home() {

	}

	@Test
	public void test1() {
		Driver.getDriver().findElement(By.name("q")).sendKeys("google", Keys.ENTER);
	}
}
