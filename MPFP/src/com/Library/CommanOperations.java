package com.Library;

import org.openqa.selenium.By;

import com.Constants.MPFPConstants;

public class CommanOperations extends MPFPConstants
{
	public boolean Quotes() throws InterruptedException
	{
		
		driver.findElement(By.linkText("Quotes")).click();
		if (driver.getCurrentUrl().contains("quotes"))
		{
			return true;
		} 
		else 
		{
			return false;
		}
		
	}
	
	public boolean Links() throws InterruptedException
	{
		driver.findElement(By.linkText("Links")).click();
		if (driver.getCurrentUrl().contains("alllinks"))
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	public boolean SignOut() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign Out")).click();
		if (driver.findElement(By.xpath("//*[@value='Sign In']")).isDisplayed())
		{
				return true;
		} 
		else 
		{
				return false;
		}
}
}
