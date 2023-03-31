package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	
	/*
	 * Select Class
	 * used to select options from the dropdown
	 * handle the dropdown
	 * 
	 * 3 Methods:
	 * 1. Index
	 * 2. Value
	 * 3. Visible Text
	 * 
	 */

	public static void main(String[] args) {
		//dropDownDemo();
		dropdownTask();
		
	}
	
	public static void dropDownDemo() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select obj = new Select(dropdown);
		//obj.selectByIndex(2);
		//obj.selectByValue("2");
		obj.selectByVisibleText("Option 1");
		
		List<WebElement> options = driver.findElements(By.tagName("option"));
		System.out.println(options.size());
	}
	
	public static void dropdownTask() {
		/*
		 * Open https://www.orangehrm.com/contact-sales/
		 * In Country dropdown: select australia
		 * print how many options are there In Country dropdown
		 * print the name of each option In Country dropdown
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement country = driver.findElement(By.name("Country"));
		List<WebElement> options = country.findElements(By.tagName("option"));
		System.out.println(options.size());
		
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
		
		
	}
}
