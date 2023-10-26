package Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviders {
	WebDriver driver;
	@DataProvider(name="users")
	public Object[][]loginInfo(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_use","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
			
		};
	}
	@Test(dataProvider = "users")
	public void loginTestCases(String un, String pw) {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("login-button")).click();
		driver.quit();
		
	}

}
