package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;


public class Screen1 {
	@Test
	public void run() throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.google.com");

		Thread.sleep(3000);
		Screen s = new Screen();

		System.out.println("performing actions by sikuli");
		//s.find("GoogleSearchTextbox.PNG");
		//s.click("GoogleSearchTextbox.PNG");
		//s.type("GoogleSearchTextbox.PNG","Facebook");
		s.find("D:\\GoogleSearchButton.PNG");
		s.click("D:\\GoogleSearchButton.PNG");
		
		
		Thread.sleep(2000);
		WebElement w = driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]"));
		System.out.println(w.isDisplayed());
		
		driver.quit();
		
		
	}

}
