package com.Test;

import org.testng.annotations.Test;

import com.Constants.MPFPConstants;
import com.Library.YMMELookup;

public class TestYMME extends MPFPConstants
{
	YMMELookup ymme=new YMMELookup();
	@Test
	public void TestMYYELookup() 
	{
		
		ymme.YMMELooup();
		
	}
	
}
