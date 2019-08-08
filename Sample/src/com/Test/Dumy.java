package com.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dumy 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("google");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li"));
		
		for (int i = 1; i < list.size(); i++) 
		{
			String data=driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li["+i+"]")).getText();
			
			String actData="google translate";
			if (actData.equalsIgnoreCase(data)) 
			{
				driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li["+i+"]")).click();
				
			}
			break;
			
		}
		
		driver.findElement(By.xpath("//*[@id='tw-sl']/span[1]")).click();
		
		
	}

}
