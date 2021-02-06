package com.devlabs.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
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
				
				WebElement DragDrop = driver.findElement(By.xpath("(//div[@class='cdk-drag example-box'])[1]"));
				
				builder.dragAndDropBy(DragDrop, 100, 100).perform();
				
				
				
				WebElement Element1 = driver.findElement(By.xpath("//li[text() = 'Sachin']"));
				WebElement Element2 = driver.findElement(By.xpath("//li[text() = 'Shewag']"));
				WebElement Element3 = driver.findElement(By.xpath("//li[text() = 'Dravid']"));
				WebElement Element4 = driver.findElement(By.xpath("//li[text() = 'Ganguly']"));

				
				builder.keyDown(Keys.CONTROL).click(Element1).click(Element2).click(Element3).click(Element4).keyUp(Keys.CONTROL).perform();
				
				 driver.close();
				
				
				

	}

}
