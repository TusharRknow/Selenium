package com.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Constants.MPFPConstants;
import com.Library.Login;
import com.XLUtils.Xlutils;

public class TestLogin extends MPFPConstants
{

	@Test
	public void testLogin() throws IOException, InterruptedException
	{
		Login login=new Login();
		boolean res;
		Xlutils xl=new Xlutils();
		String uid=xl.getStringData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 4);
		int pass=xl.getNumricData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 5);
		
		String pasword=Integer.toString(pass);
		
		System.out.println(uid);
		System.out.println(pass);
		
		res=login.loginUser(uid, pasword);
		Assert.assertTrue(res);
		System.out.println(driver.getCurrentUrl());
		
	}
}
