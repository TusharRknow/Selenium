package com.Tests;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Constants.MPFPConstants;
import com.Library.CommanOperations;
import com.Library.Login;
import com.XLUtils.Xlutils;

public class TestQuote extends MPFPConstants
{
	@Test
	public void testQuote() throws IOException, InterruptedException
	{
		Login login=new Login();
		Xlutils xl=new Xlutils();
		CommanOperations cop=new CommanOperations();
		boolean res;
		
		String uid=xl.getStringData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 4);
		int pass=xl.getNumricData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 5);
		
		String pasword=Integer.toString(pass);
		
		System.out.println(uid);
		System.out.println(pass);
		
		login.loginUser(uid, pasword);
		Thread.sleep(2000);
		res=cop.Quotes();
		Assert.assertTrue(res);
		
	}
}
