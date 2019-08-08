package com.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropdown
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("google");
		WebElement List = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]"));
		
		if(List.isDisplayed())
		{
		//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<WebElement> list=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li"));
			System.out.println(list.size());
			for (int i=1; i<=list.size();i++)
			{
				System.out.println("String"+i+" : "+driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li["+i+"]")).getText());
				
			}
			
		}
			
		
		//System.out.println(list.size());
		
		
	}

}
