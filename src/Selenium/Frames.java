package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("frameName");
		driver.switchTo().frame(driver.findElement(By.xpath("xpath")));
		driver.switchTo().defaultContent(); //back to main frame
	    driver.switchTo().parentFrame(); // back to previous frame
	    
	    
	    
	}

}
