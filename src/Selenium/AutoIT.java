package Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutoIT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/autoit.html");			
		driver.manage().window().maximize();
		driver.findElement(By.id("postjob")).click();			
		driver.switchTo().frame("JotFormIFrame-72320244964454");

	    driver.findElement(By.id("input_3")).sendKeys("Gaurav");                                 					
	    driver.findElement(By.id("input_4")).sendKeys("test.test@gmail.com");					
	    // below line execute the AutoIT script .
	     Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");		
	    driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");					
	    driver.findElement(By.id("input_2")).click();
	    driver.close();
	    
	    
	    
	}

}
