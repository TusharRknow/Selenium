package com.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Constants.MPFPConstants;
import com.Library.CommanOperations;
import com.Library.Login;
import com.XLUtils.Xlutils;

public class TestSignOut extends MPFPConstants
{
		@Test
		public void testSignOut() throws InterruptedException, IOException
		{
			Login login=new Login();
			boolean res;
			Xlutils xl=new Xlutils();
			CommanOperations cop=new CommanOperations();
			
			String uid=xl.getStringData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 4);
			int pass=xl.getNumricData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 5);
			
			String pasword=Integer.toString(pass);
			
			System.out.println(uid);
			System.out.println(pass);
			
			login.loginUser(uid, pasword);
			Thread.sleep(2000);
			res=cop.SignOut();
			Assert.assertTrue(res);
			if (res=true)
			{
				xl.setData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 6, "Pass");
			} 
			else 
			{
				xl.setData("E:\\Selenium Projects\\MPFP\\src\\com\\TestData\\test.xlsx", "TestStep", 1, 6, "Fail");
			}
		}
}
