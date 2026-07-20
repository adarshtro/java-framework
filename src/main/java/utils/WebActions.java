package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {
	WebDriver driver =DriverFactory.getdrivDriver();
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public void clickElement(String xpath) {
		try {
			WebElement element =wait .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
