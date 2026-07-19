package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getdrivDriver() {
		return driver.get();
	}
	
	public static void initDriver() {
		driver.set(new ChromeDriver());
	}
	
	public static void quitDriver() {
		if(driver.get()!=null) {
			driver.get().quit();
			driver.remove();
		}
	}

}
