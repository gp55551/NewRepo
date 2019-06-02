package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub

		
		
		Screen s = new Screen();
		
		Pattern searchTextBox = new Pattern("D:\\GoogleSearchTextbox.PNG");
		Pattern searchTextBoxP = searchTextBox.similar(0.4f);
		
		
		Pattern searchButton = new Pattern("D:\\GoogleSearchButton.PNG");
		Pattern searchButtonP = searchButton.similar(0.4f);
		
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();

		System.out.println("performing actions by sikuli");
		s.wait(searchTextBoxP,3);
		s.type(searchTextBoxP,"Facebook");
		s.wait(searchButtonP,3);
		s.click(searchButtonP);
		
		
		
		Thread.sleep(2000);
		WebElement w = driver.findElement(By.xpath("//h3[contains(text(),'Facebook - Log In or Sign Up')]"));
		System.out.println(w.isDisplayed());
		
		driver.quit();
		
		
	}

}
