package TestNgBasics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotaionsDemo {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in Before Test");
	}
	
	@AfterSuite
	public void sendReport() {
		System.out.println("Sending Status Report");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Open the browser");
		System.out.println("Launch the application");
	}

	@Test
	public void validateTitle() {
		System.out.println("Validating Title test case");

	}

	@Test
	public void validateLogin() {
		System.out.println("Validating Login test case");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close the browser");
		System.out.println();
	}

}
