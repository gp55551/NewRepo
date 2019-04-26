package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
		action.contextClick(link).perform();
		//use perform().build() for multiple operations done
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		element.click();
		
		//driver.quit();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println("closing browser");
		//driver.quit();
		
		//double click
		WebElement link1 =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(link1).perform();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		
	}

}
