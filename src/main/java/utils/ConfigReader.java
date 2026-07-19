package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties properties;
	
	public ConfigReader() {
		properties=new Properties();
		String configFilePath=System.getProperty("user.dir")+"/src/main/java/constants/envprops.properties";
		
		try {
			FileInputStream fin = new FileInputStream(configFilePath);
			properties.load(fin);
			
			
		}catch (FileNotFoundException e) {
			throw new RuntimeException("File not found:"+configFilePath,e);
		}catch (IOException e) {
			throw new RuntimeException("File not readable:"+configFilePath,e);
		}
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
	
	public static void main(String args[]) {
		ConfigReader reader = new ConfigReader();
		System.out.println(ConfigReader.getProperty("bmsurl"));		
	}

}
