package com.sdw.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.sdw.constants.FrameworkConstants;

public final class ReadPropertyFile {

	private ReadPropertyFile() {

	}

	private static Properties prop = new Properties();
	static {
		FileInputStream fis;
		try {
			System.out.println(FrameworkConstants.getConfigfilepath());
			fis = new FileInputStream(FrameworkConstants.getConfigfilepath());
			
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) throws Exception {

		String value = "";
		value = prop.getProperty(key);
		if (Objects.isNull(value) || Objects.isNull(key) ) {
			throw new Exception("Property name : " + key + " is not found. Please check the config file again.");
		}
		return value;
	}
	
	
	/*
	 
	 Map<String , String> map = new hashMap<>();
	static {
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config/config.properties");
			prop.load(fis);
			
			for(Map.Entry<Object, Object> entry: prop.entrySet()){
				map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
			
			// prop.entrySet().forEach(entry->map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String get(String key) throws Exception {

		String value = "";
		value = prop.getProperty(key);
		if (Objects.isNull(map.get(key)) || Objects.isNull(key) ) {
			throw new Exception("Property name : " + key + " is not found. Please check the config file again.");
		}
		return value;
	}
*/
}
