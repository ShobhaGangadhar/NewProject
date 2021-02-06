package com.devlabs.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablelist {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		//Open chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load an URL in the opened browser
		driver.get("https://devlabs-860f0.web.app/table");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.xpath("//tr/td[3]"));
		
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		
      List<WebElement> elements1 = driver.findElements(By.xpath("//input[@type ='checkbox']"));
		
		for(WebElement element : elements1) {
			element.click();
		}

	}

}
