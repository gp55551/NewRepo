package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		TakesScreenshot sc = ((TakesScreenshot)driver);
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\abc.jpg");
		FileUtils.copyFile(src, dest);
		System.out.println("takes screenschot");
		
		
		driver.quit();
		System.out.println("closing browser");
		
		
	}

}
