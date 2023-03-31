package SeleniumBasics;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsDemo {

	public static void main(String[] args) {
		
		/*
		 * Waits: Synchronization
		 * 
		 * Implicit
		 * Explicit
		 * 
		 */
		//open https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		//enter username, password
		//click on login button
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		/*
		 * Open Gmail
		 * https://accounts.google.com/v3/signin/identifier?dsh=S1409679354%3A1678467112270045&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AWnogHcvua-gxZVkeBrgGdjwjBXJMSlcoe_kUCZBOhLrrRhPVcoFDfWdLgyvaQBo5xIiZThl3F-4xA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin
		 * Enter email id as trainer@way2automation.com
		 * Enter password as "TestPassword"
		 * 
		 */
	}
}
