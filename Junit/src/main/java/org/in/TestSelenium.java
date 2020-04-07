package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/akini/eclipse-workspace/Junit/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Ssas");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("aaa");
		WebElement btn = driver.findElement(By.id("u_0_b"));
		btn.click();
		
				
	}

}
