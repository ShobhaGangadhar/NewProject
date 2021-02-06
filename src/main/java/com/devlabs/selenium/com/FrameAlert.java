package com.devlabs.selenium.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAlert {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				//Open chrome browser
				
				ChromeDriver driver = new ChromeDriver();
				
				//Load an URL in the opened browser
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				driver.switchTo().frame("iframeResult");
				
			driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
			
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Shobha");
			alert.accept();
			
			String text = driver.findElement(By.id("demo")).getText();
			
			if(text.contains("Shobha")) {
				System.out.println("Text has name: Shobha");
			}
			else
			System.out.println("Text doesn't has name: Shobha");
			
			driver.switchTo().defaultContent();
			driver.close();

	}

}
