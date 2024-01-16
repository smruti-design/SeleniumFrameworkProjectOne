package com.sdw.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants() {
		
	}
	
	private static final String RESOURCEPATH = System.getProperty("user.dir") + "/src/test/resources";

	private static final String CONFIGFILEPATH =  RESOURCEPATH + "/config/config.properties";

	private static final String CHROMEDRIVERPATH = RESOURCEPATH + "/executables/chromedriver.exe";

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}

	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	
}
