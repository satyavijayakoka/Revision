package Revision;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeSuitetoAfterSuite {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before Method");
	}
	@Test
	public void testCaseOne() {
		System.out.println("test case one");
	}
	@Test
	public void testCaseTwo() {
		System.out.println("test case two");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after Method");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after Class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	

}
