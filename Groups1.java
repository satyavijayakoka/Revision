package Revision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups1 {

	@Test(groups ="regression")
	public void testCaseOne() {
		System.out.println("test case one pass");
		Assert.assertEquals(true, true);
	}
	@Test(groups ="regression")
	public void testCaseTwo() {
		System.out.println("test case two pass");
		Assert.assertEquals(true, true);
	}
	@Test(groups ="regression")
	public void testCaseThree() {
		System.out.println("test case three pass");
		Assert.assertEquals(true, true);
	}
}
