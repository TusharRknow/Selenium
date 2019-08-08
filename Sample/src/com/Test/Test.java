package com.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://dev.myplaceforparts.com/web/alliance/home");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,700);");
		Thread.sleep(1000);
		jse.executeScript("scroll(0,0);");
		
		driver.findElement(By.xpath("//*[@value='Sign In']")).click();

		driver.findElement(By.id("username")).sendKeys("aa600pc");
		driver.findElement(By.id("password")).sendKeys("234567");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		if (driver.findElement(By.xpath(" //span[contains(text(),'Welcome')]")).isDisplayed())
		{
			System.out.println("User Login Sucessfully");
		} 
		else 
		{
			System.out.println("Error User Login");
		}

		driver.findElement(By.xpath("//a[@id='myplaceLink']//img")).click();
		
		if (driver.getCurrentUrl().contains("web/alliance/home")) 
		{
			System.out.println("User In MPFP");
		}
		else 
		{
			System.out.println("User Not In MPFP");
		}
		
		driver.findElement(By.id("suppAccTextBox")).sendKeys("Oil");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().contains("/results"))
		{
			System.out.println("User reach at Result page...");
		} 
		else
		{
			System.out.println("User Not reach at Result page...");
		}
	}

}
