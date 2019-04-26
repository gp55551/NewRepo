package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basics {
static WebDriver driver; 

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		/*
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
		System.out.println("waiting");
		*/
		
		System.out.println("closing browser");
		driver.quit();

	}

}

