package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver_win32\\chromedriver.exe");
		
        String inputFilePath = "D:\\";
		System.out.println(inputFilePath + "FileTextBox.PNG");
		Pattern fileInputTextBox = new Pattern(inputFilePath + "FileTextBox.PNG");
        Pattern openButton = new Pattern(inputFilePath + "OpenButton.PNG");
        
        Screen s = new Screen();

        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/image_upload/index.php");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
        driver.findElement(By.xpath(".//*[@id='photoimg']")).click();

        s.wait(fileInputTextBox, 20);
        s.type(fileInputTextBox, inputFilePath + "Test.docx");
        s.click(openButton);
        
        driver.close();
		
	}

}
