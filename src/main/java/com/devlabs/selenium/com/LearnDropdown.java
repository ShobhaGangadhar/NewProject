package com.devlabs.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		//creating an environment for the system to access Chrome or any browser.
		
				//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				//Open chrome browser
				
				ChromeDriver driver = new ChromeDriver();
				
				//Load an URL in the opened browser
				driver.get("https://devlabs-860f0.web.app/dropdown");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//To locate the drop down select tag
				WebElement DropDown = driver.findElement(By.id("Index"));
				//create object for select class
				Select list = new Select(DropDown);
				//Method-1 select value by index
				list.selectByIndex(2);
				
				//Method-2 select value by visible text
				list.selectByVisibleText("Apple");
				
				//Method-3 select by value
				list.selectByValue("3");
				
				driver.close();
	}

}
