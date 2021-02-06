package com.devlabs.selenium.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		//Open chrome browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load an URL in the opened browser
		driver.get("https://devlabs-860f0.web.app/alert");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("12345rtf")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String Value = alert.getText();
		
		System.out.println(Value);
		
		alert.accept();
		
		driver.findElement(By.id("zxcvbnm")).click();
		
        String Value1 = alert.getText();
		
		System.out.println(Value1);
		
		alert.accept();
		
        driver.findElement(By.id("aswdefr")).click();
		
        String Value2 = alert.getText();
		
		System.out.println(Value2);
		
		alert.sendKeys("Devlabs");
		
		alert.dismiss();
		
		

	}

}
