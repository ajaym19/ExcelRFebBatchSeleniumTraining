package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		//open http://www.seleniumframework.com/Practiceform/
		//click on timing alert
		//handle the alert
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("timingAlert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		//
		
	}
}
