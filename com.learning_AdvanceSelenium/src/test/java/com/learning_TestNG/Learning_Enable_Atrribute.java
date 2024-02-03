package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Enable_Atrribute {

	@Test (enabled = false)
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case..", true);
	}
	
	@Test
	public void registerTest()
	{
		Reporter.log("Executing Register Test Case",true);
	}
	
	@Test (enabled = false)
	public void SearchTest()
	{
		Reporter.log("Searchh Test Case",true);
	}
}
