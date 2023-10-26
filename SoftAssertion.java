package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	WebDriver driver;
	
	@Test
	public void testContactForm() {
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	
	SoftAssert sf = new SoftAssert();
	
	// validate title
	String title = driver.getTitle();
	sf.assertEquals(title, "S Labs");
	
	// validate url
	boolean avail = driver.getCurrentUrl().contains("v1");
	sf.assertTrue(avail);
	
	// validate login
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	driver.quit();
	
	sf.assertAll();
	
	
	
	}

}
