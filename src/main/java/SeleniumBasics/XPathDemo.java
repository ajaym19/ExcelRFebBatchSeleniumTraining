package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	/*
	 * XPATH
	 * 
	 *  //htmlTag[@attributeName = 'attributeValue']
	 * 
	 *  //input[@name = 'email']
	 *  
	 *  Methods
	 *  text()
	 *  
	 *  //input[text()='text']
	 *  
	 *  //*[@id="passContainer"]/input
	 *  
	 *  //input[@id='email']/parent::div/following-sibling::div/child::div/input
	 *  
	 *  parent::htmltag
	 *  child::htmltag
	 *  following-sibling::htmltag
	 * 	preceding-sibling::htmltag
	 * 
	 * Task:
	 * open https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	 * from username goto password
	 * //input[@name = 'username']/parent::div/parent::div/parent::div/following-sibling::div[1]/div/div[2]/input
	 * 
	 *
	 * from password goto username
	 * //input[@name = 'password']
	 * 
	 *  //input[@name = 'username']
	 * 
	 */
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	}
}
