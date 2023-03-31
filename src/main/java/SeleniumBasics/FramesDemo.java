package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	/*
	 * Switching to Frame: 
	 * 1. Index 
	 * 2. Id or Name 
	 * 3. WebElement
	 * 
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("Count of Frames ==> " + frames.size());

		// first switch to the frame
		// driver.switchTo().frame(0);
		// driver.switchTo().frame("mce_0_ifr");
		WebElement target = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(target);
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Ajay Trainer");
		//driver.switchTo().parentFrame(); used if there are nested frames
		driver.switchTo().defaultContent();
		
	}
}
