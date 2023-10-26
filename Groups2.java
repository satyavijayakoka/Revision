package Revision;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups2 {
	
	@Test(groups ="login")
	public void testCaseFour() {
		System.out.println("test case four pass");
		Assert.assertEquals(true, true);
	}
	@Test(groups ={"login","regression"})
	public void testCaseFive() {
		System.out.println("test case five pass");
		Assert.assertEquals(true, true);
	}
	@Test(groups ="login")
	public void testCaseSix() {
		System.out.println("test case six pass");
		Assert.assertEquals(true, true);
	}

}
