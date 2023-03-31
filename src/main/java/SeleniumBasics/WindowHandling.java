package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		System.out.println("Parent Window Title ==>> " + driver.getTitle());
		//System.out.println("Parent Window ID ==>> " + driver.getWindowHandle());
		driver.findElement(By.id("button1")).click();
		// at this point a new window (child) is present
		// so there are 2 windows, one parent and one child
		// identify the id of parent and child window
		// switch to the windows based on the ids
		Set<String> ids = driver.getWindowHandles();
//		for (String abc : ids) {
//			System.out.println(abc);
//		}
		
		Iterator<String> it = ids.iterator();
		String pwindowid =  it.next();
		String cwindowid = it.next();
		System.out.println("Parent Window ID ==>> " + pwindowid);
		System.out.println("Child Window ID ==>> " + cwindowid);

		driver.switchTo().window(cwindowid);
		System.out.println("Child Window Title ==>> " + driver.getTitle());
		
		//I want to print the parent window title?
		driver.switchTo().window(pwindowid);
		System.out.println("Parent Window Title ==>> " + driver.getTitle());
		
		//driver.close(); //it will close the window pointed  by the driver
		driver.quit(); //it will close all the windows

	}
}
