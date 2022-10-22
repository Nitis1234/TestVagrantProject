package com.TestVagrantProject.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	String path="C:\\Users\\nitis\\eclipse-workspace\\TestVagrantProject\\Configuration\\confic.properties";
	public ReadConfig() {
		prop=new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Getting Url 
	public String getBaseUrl() {
		String value=prop.getProperty("baseUrl");
		if(value!=null) {
			return value;
		}else {
			throw new RuntimeException("url not specified in config file");
		}
	}
	//Getting Browser Name
	public String getBrowser() {
		String value=prop.getProperty("browser");
		if(value!=null) {
			return value;
		}else {
			throw new RuntimeException("browser not specified in config file");
		}
	}
}
