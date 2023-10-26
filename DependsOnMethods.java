package Revision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	//@Test(dependsOnMethods = "TestCaseFour") // cd
	
	@Test
	public void testCaseOne() {
		System.out.println("test case one pass");
		Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods ="testCaseOne")
	public void testCaseTwo() {
		System.out.println("test case two pass");
		Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods ="testCaseTwo()")
	public void testCaseThree() {
		System.out.println("test case three pass");
		Assert.assertEquals(true, true);
	}
	@Test(dependsOnMethods ="testCaseThree")
	public void testCaseFour() {
		System.out.println("test case four pass");
		Assert.assertEquals(true, true);
	}

}
