package com.devlabs.selenium.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapshot {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				//Open chrome browser
				
				ChromeDriver driver = new ChromeDriver();
				
				//Load an URL in the opened browser
				driver.get("https://devlabs-860f0.web.app/aui");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				WebElement Drag = driver.findElement(By.id("draggable"));
				
				WebElement Drop = driver.findElement(By.id("droppable"));
				
				Actions builder = new Actions(driver);
				
				builder.dragAndDrop(Drag, Drop).perform();
				
				File temp = driver.getScreenshotAs(OutputType.FILE);
				
				File img = new File("./snaps/img001.png");
				
				FileUtils.copyFile(temp, img);
				
                File temp1 = Drop.getScreenshotAs(OutputType.FILE);
				
				File img1 = new File("./snaps/img002.png");
				
				FileUtils.copyFile(temp1, img1);


	}

}
