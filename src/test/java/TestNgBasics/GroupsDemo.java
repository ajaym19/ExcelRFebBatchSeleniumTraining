package TestNgBasics;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = {"mobile"})
	public void mobileTc1() {
		System.out.println("Mobile TC1");
	}

	@Test(groups = {"mobile"})
	public void mobileTC2() {
		System.out.println("Mobile TC 2");
	}

	@Test(groups = {"web"})
	public void webTC1() {
		System.out.println("Web TC1");
	}

	@Test(groups = {"web"})
	public void webTC2() {
		System.out.println("Web TC2");
	}
	
	@Test
	public void tc() {
		System.out.println("Generic TC");
	}

}
