package com.sdw.tests;

import org.testng.annotations.Test;

import com.sdw.pages.OrangeHRMLoginPage;

public final class OrangeHRMTest extends BaseClass{

	private OrangeHRMTest() {
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		OrangeHRMLoginPage orm = new OrangeHRMLoginPage();
		Thread.sleep(5000);
		orm.enterUsername("Admin");
		orm.enterPassword("admin123");
		orm.clickLogin();
		Thread.sleep(10000);
	}
}
