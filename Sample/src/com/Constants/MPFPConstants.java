package com.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MPFPConstants 
{
	public static WebDriver driver=new FirefoxDriver();
	
	@BeforeTest
	public void Login() throws InterruptedException
	{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://dev.myplaceforparts.com/web/alliance/home");
	driver.findElement(By.xpath("//*[@value='Sign In']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.id("username")).sendKeys("aa600pc");
	driver.findElement(By.id("password")).sendKeys("234567");
	driver.findElement(By.xpath("//*[@name='submit']")).click();
	
	driver.findElement(By.xpath("//*[@title='MyPlace']")).click();
	WebElement banner=driver.findElement(By.xpath("//*[@id='biggame-dialog']"));
	
//		if (banner.isDisplayed()) 
//		{
//			driver.findElement(By.xpath("//*[@id='continueBtn']/a/span")).click();
//			
//		}
	
	
	}
	
	@AfterTest
	public void Logout()
	{
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
		
	}
	

}
