package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliFB {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		Screen screen = new Screen();
		Pattern username = new Pattern("D:\\Email1.PNG");
		Pattern password = new Pattern("D:\\Password.PNG");
		Pattern login = new Pattern("D:\\LogIn.PNG");

		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		

		screen.wait(username, 10);
		screen.type(username, "softwaretestingmaterial@gmail.com");
		screen.type(password, "softwaretestingmaterial");
		screen.click(login);
		
		
		driver.quit();
	}

}