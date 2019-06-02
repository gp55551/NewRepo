package Selenium;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Screen2 {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub

		Thread.sleep(10000);
		
		
		Screen s = new Screen();
		s.find("AD.PNG");
		s.doubleClick("AD.PNG");
		s.find("Notepad1.PNG");
		s.type("Notepad1.PNG", "This is Nice Sikuli Tutorial!!!!");
	}

}