package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	
	/*
	 * Locators:
	 * strategy using which we will identify the elements
	 * 
	 * id
	 * name
	 * 
	 * css
	 * 	#email
	 * 
	 * xpath
	 * //*[@id="email"]
	 * 
	 * Relative XPath
	 * //*[@id="pageFooterChildren"]/ul/li[6]/a
	 * 
	 * Absolute XPath
	 * /html/body/div[1]/div[1]/div[2]/div/div/div[2]/ul/li[6]/a
	 * 
	 * class name - not recommended
	 * 
	 *  //these 2 are for links/urls
	 * linktext - exact match
	 * partiallinktext - partiallly matching string
	 * 
	 * 
	 * tagname: will give u all the matching elements to the tag
	 * 
	 * 
	 * XPATH:
	 *  //htmlTag[@attributeName = 'value']
	 *  //*[@id="checkboxes"]/input[1]
	 *  
	 * 
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("#email")).sendKeys("testemail@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("testpassword");
		//driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//tagName
		
		
		
	}
}
