package Org.in;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitsample {

	static WebDriver driver;

	public static void main(String[] args) {

		/* @before class .. @before ..test @after .. @after class */

	}

	@BeforeClass
	public static void lauch() {
		System.setProperty("webdriver.chrome.driver", "/home/akini/eclipse-workspace/Junit/Driver/chromedriver");
		driver = new ChromeDriver();

	}

	@Before
	public void starttime() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void test1() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Saas");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("ppp");
		WebElement btn = driver.findElement(By.id("u_0_b"));
		btn.click();

	}

	@Test
	public void test2() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Ssas");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("aaa");
		WebElement btn = driver.findElement(By.id("u_0_b"));
		btn.click();

	}

	@Test
	public void test3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("Ssas");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("aaa");
		WebElement btn = driver.findElement(By.id("u_0_b"));
		btn.click();

	}

	@After
	public void endtime() {
		Date d2 = new Date();
		System.out.println(d2);
	}

	@AfterClass
	public static void quit() {
//		WebDriver driver = new ChromeDriver();

		driver.quit();
	}
}
