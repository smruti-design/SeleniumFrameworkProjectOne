package com.sdw.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test
	public void test1() {
		
	}
	
	@DataProvider
	public Object[][] getData(){
		return new Object[][] {
			{"smruti"},
			{1}
		};
	}
	

}
