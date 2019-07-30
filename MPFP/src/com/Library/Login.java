package com.Library;

import org.openqa.selenium.By;

import com.Constants.MPFPConstants;

public class Login extends MPFPConstants
{
	public String userID;
	public String password;
	public boolean loginUser(String uid, String pass) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(uid);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		
		driver.findElement(By.xpath("//*[@title='MyPlace']")).click();
		
		if (driver.findElement(By.xpath("//*[@id='_mpp_navigation_WAR_mpp_navigationportlet_INSTANCE_NU3h_signout']/span")).isDisplayed()) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

}
