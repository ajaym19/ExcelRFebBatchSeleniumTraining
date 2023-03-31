package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(4000);
		//at this point, there is an alert present
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(4000);
		
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(4000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(4000);
		Alert ale = driver.switchTo().alert();
		String alerttext = al.getText();
		System.out.println(alerttext);
		ale.sendKeys("Ajay Trainer");
		ale.accept();
		driver.close();
		
		
	}
}
