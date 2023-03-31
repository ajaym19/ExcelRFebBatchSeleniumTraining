package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllUrls {

	public static void main(String[] args) {
		/*
		 * 1. Identify how many urls are present on the page
		 * 2. Print the text of each url
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		
		List<WebElement> urls = driver.findElements(By.tagName("a"));
		System.out.println("Count of URLS ==>> "+urls.size());
		
//		for(int i = 0; i < urls.size(); i++) {
//			System.out.println(urls.get(i).getText());
//		}
		
		for (WebElement abc : urls) {
			System.out.println(abc.getText());
		}
		
		driver.close();
		
	}
}
