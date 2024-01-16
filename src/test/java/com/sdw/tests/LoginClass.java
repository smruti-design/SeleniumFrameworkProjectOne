package com.sdw.tests;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.sdw.driver.Driver;
import com.sdw.driver.DriverManager;

public final class LoginClass extends BaseClass{
	
	private LoginClass(){
		
	}
	
	@Test
	public void test() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("cognizant",Keys.ENTER);
	}
	
	@Test
	public void testSite1() {
		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Testing Mini Bytes - Youtube", Keys.ENTER);
		String title = DriverManager.getDriver().getTitle();
		
		Assertions.assertThat(title)
			.isNotNull()
			.containsIgnoringCase("Google search")
			.hasSizeBetween(15, 100);
		
		List<WebElement> list = DriverManager.getDriver().findElements(By.xpath("//h3/span"));
		
		Assertions.assertThat(list)
			.hasSize(1)
			.extracting(WebElement :: getText);
		
		
	}
}
