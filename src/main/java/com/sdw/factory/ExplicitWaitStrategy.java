package com.sdw.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sdw.driver.DriverManager;
import com.sdw.enums.WaitStrategy;

public class ExplicitWaitStrategy {
	
	public static WebElement performExplicitWait(WaitStrategy wait, By by) {
		WebElement element = null;
		if(wait == WaitStrategy.CLICKABLE) {
			element = new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(wait == WaitStrategy.PRESENCE) {
			element = new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(by));
		}
		else if(wait == WaitStrategy.VISIBLE) {
			element = new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else {
			element = DriverManager.getDriver().findElement(by);
		}
		return element;
	}

}
