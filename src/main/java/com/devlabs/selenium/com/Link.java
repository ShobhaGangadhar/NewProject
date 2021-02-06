package com.devlabs.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		//creating an environment for the system to access Chrome or any browser.
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		//Open chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load an URL in the opened browser
		driver.get("https://devlabs-860f0.web.app/hyperlink");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("home")).click();
		
		driver.close();

	}

}
