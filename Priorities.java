package Revision;

import org.testng.annotations.Test;

public class Priorities {
	
	@Test(priority=-1)
	public void Banana() {
		System.out.println("banana");
	}
	@Test(priority=2)
	public void Apple() {
		System.out.println("apple");
	}
	@Test(priority=0)
	public void Carrot() {
		System.out.println("carrot");
	}

}
