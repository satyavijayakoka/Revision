package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeandAfterMethod {
	
	WebDriver driver;
	
	@BeforeMethod()
		public void setUp() {
		driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");
		driver.findElement(By.id("datepicker")).click();
			
		}
	@Test
	public void testCase1() {
		boolean avail = driver.getCurrentUrl().contains("picker");
		Assert.assertTrue(avail);
		
	}
	
	@Test
	public void testCase2() {
		boolean avail = driver.findElement(By.tagName("h1")).isDisplayed();
		Assert.assertTrue(avail);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
