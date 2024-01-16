package com.sdw.tests;

import org.assertj.core.api.Assertions;
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
	
	@Test
	public void test3() {
		String temp = "Hello World";
		
		Assertions.assertThat(temp)
					.isNotNull()
					.as("String is actually empty").isNotEmpty()
					.isNotBlank()
					.containsWhitespaces()
					.containsIgnoringCase("world")
					.matches("\\w.*" + " World")
					.doesNotContainPattern("\\d.*");
	}
}
