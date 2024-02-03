package com.sdw.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {

	@Test(dataProvider = "getDataFromExcel")
	public void test1Excel(String username, String password, String firstName, String lastName) {
		System.out.println(username +" "+ password +" "+ firstName +" "+ lastName);
	}
	
	
	@Test(dataProvider = "getDataFromExcelHashMap")
	public void test2ExcelHash(Map<String, String> map) {
		 System.out.println(map.get("username"));
	}
	
	
	@DataProvider
	public Object[][] getDataFromExcel() throws IOException{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/excel/TestDataProvider1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("testing");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[row][col];
		
		for(int i = 1; i <= row ; i++) {
			for(int j = 0 ; j < col; j++) {
				obj[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
	}
	
	
	@DataProvider
	public Object[] getDataFromExcelHashMap() throws IOException {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/excel/TestDataProvider1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("testing");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		Object[] obj = new Object[row];
		Map<String, String> map;
		
		for(int i = 1 ; i <= row ; i++) {
			map = new HashMap<>();
			for(int j = 0 ; j < col ; j++) {
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key,  value);
				obj[i-1] = map;
			}
		}
		return obj;
	}
}