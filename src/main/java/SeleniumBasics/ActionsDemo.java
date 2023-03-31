package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// hover();
		// keyboardevents();
		// clicks();
		// scrolling();
		dragdrop();
	}

	public static void hover() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement kidsmenu = driver.findElement(By.xpath("//a[text()='Kids'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(kidsmenu).perform();
	}

	public static void keyboardevents() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.moveToElement(username).keyDown(Keys.SHIFT).sendKeys("ajaytestemail").keyUp(Keys.SHIFT).perform();
		act.keyDown(Keys.TAB).perform();

	}

	public static void clicks() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		WebElement username = driver.findElement(By.id("email"));
		// act.doubleClick().perform();
		act.contextClick(username).perform();

	}

	public static void scrolling() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		/*
		 * Scrolling Parameters First Parameter: X-axis: used to scroll left(-ve) and
		 * right(+ve) Second Parameter: Y-axis: used to scroll up(-ve) and down(+ve)
		 */

		// act.scrollByAmount(0, 600).perform();

		// scrolling to a specific webelement
		WebElement target = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
		act.scrollToElement(target).perform();
		
	}

	public static void dragdrop() {
		//open https://jqueryui.com/droppable/
		//identify the source webelement
		//identify the target webelement
		//create Actions obj
		//call dragAndDrop method using actions obj and pass the source and target as a parameter
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).perform();
	}

}
