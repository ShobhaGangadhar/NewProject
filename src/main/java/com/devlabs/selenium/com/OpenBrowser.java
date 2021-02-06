package com.devlabs.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//creating an environment for the system to access Chrome or any browser.
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		//Open chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load an URL in the opened browser
		driver.get("https://devlabs-860f0.web.app/edit");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Get Title
		String Title = driver.getTitle();
		System.out.println(Title);
		
			
		WebElement ElementFirstName = driver.findElement(By.id("fullName"));
		ElementFirstName.sendKeys("Devlabs");
		
		driver.findElement(By.id("join")).sendKeys("human being", Keys.TAB);
		
		//String Value = driver.findElement(By.id("getMe")).getText();
		//System.out.println(Value);
		
		driver.findElement(By.id("clearMe")).clear();
		
		boolean value1 = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(value1);
		
		
		//Close browser
			driver.close();

	}

}
