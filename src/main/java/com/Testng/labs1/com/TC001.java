package com.Testng.labs1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001 {
	
	@Test
	
	public void tc001() {

	//creating an environment for the system to access Chrome or any browser.
	
	//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

	//Open chrome browser
	
	ChromeDriver driver = new ChromeDriver();
	
	//Load an URL in the opened browser
	driver.get("https://devlabs-860f0.web.app/button");
	
	//Maximize the window
	driver.manage().window().maximize();
	
	driver.findElement(By.name("button1")).click();
	
	driver.close();

}
		// TODO Auto-generated method stub

	}


