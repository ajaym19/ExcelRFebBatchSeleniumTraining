package TestNgBasics;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount = 3)
	public void m1() {
		System.out.println("Test Case 1");
	}
	
}
