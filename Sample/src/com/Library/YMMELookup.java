package com.Library;

import org.openqa.selenium.By;

import com.Constants.MPFPConstants;

public class YMMELookup extends MPFPConstants
{

	public void YMMELooup()
	{
		driver.findElement(By.xpath("//*[@title=2010]")).click();
		driver.findElement(By.xpath("//*[@title='AUDI']")).click();
		driver.findElement(By.xpath("//*[@title='A4']")).click();
		
	}
}
