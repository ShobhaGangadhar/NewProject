package com.devlabs.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElements {

	public static void main(String[] args) {
		
		
				//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				//Open chrome browser
				
				ChromeDriver driver = new ChromeDriver();
				
				//Load an URL in the opened browser
				driver.get("https://www.amazon.in");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
				driver.findElement(By.id("nav-search-submit-button")).click();
				
				//to find multiple elements in single line
				List<WebElement> elements = driver.findElements(By.xpath("//span[@class = 'a-size-medium a-color-base a-text-normal']"));
				
				for(WebElement eachelement : elements) {
					System.out.println(eachelement.getText());
				}

	}

} 
