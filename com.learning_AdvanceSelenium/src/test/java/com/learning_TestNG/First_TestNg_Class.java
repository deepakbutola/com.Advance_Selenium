package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNg_Class {

	@Test
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case..", true);
	}
	
	@Test
	public void registerTest()
	{
		Reporter.log("Executing Register Test Case",true);
	}
	
	@Test
	public void SearchTest()
	{
		Reporter.log("Search Test Case",true);
	}
}
