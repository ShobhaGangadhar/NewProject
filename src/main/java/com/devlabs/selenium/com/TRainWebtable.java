package com.devlabs.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRainWebtable {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gangadhar/eclipse-workspace/SeleniumTraining/Drivers/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				//Open chrome browser
				
				ChromeDriver driver = new ChromeDriver();
				
				//Load an URL in the opened browser
				driver.get("https://erail.in/");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				WebElement FromStation = driver.findElement(By.xpath("//input[@id = 'txtStationFrom']"));
				FromStation.clear();
				FromStation.sendKeys("MS");
				FromStation.sendKeys(Keys.TAB);
				
				WebElement ToStation = driver.findElement(By.xpath("//input[@id = 'txtStationTo']"));
				ToStation.clear();
				ToStation.sendKeys("TPJ");
				ToStation.sendKeys(Keys.TAB);
				
				driver.findElement(By.xpath("//input[@id = 'chkSelectDateOnly']")).click();
				
				WebElement table = driver.findElement(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']"));
				List<WebElement> rows = table.findElements(By.tagName("tr"));
				
				System.out.println(rows.size());
				
				
				for(int i=0; i<rows.size(); i++)
				{
					WebElement eachrow = rows.get(i);
					List<WebElement> cols = eachrow.findElements(By.tagName("td"));
					if(!cols.get(1).getText().startsWith("M")) {
						System.out.println(cols.get(1).getText()+"->"+cols.get(0).getText());
					}
					
					
					
				}
				
				
				
				
				
				
	}

}
