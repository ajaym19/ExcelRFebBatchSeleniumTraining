package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingApplication {

	//https://www.facebook.com/
	
	/*
	 * Facebook Login
	 * 1. Open browser
	 * 2. Open the application
	 * 3. Enter email id
	 * 4. Enter password
	 * 5. Click on Login button
	 * 6. Close the browser
	 */
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TestPassword");
		driver.findElement(By.name("login")).click();
		
		//driver.close();
	}
}
