package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Depends_On_Methods_Attribute {

	
	@Test (dependsOnMethods = "registerTest")
	public void loginTest()
	{
		Reporter.log("Executing Login Test Case..", true);
	}
	
	@Test
	public void registerTest()
	{
		Reporter.log("Executing Register Test Case",true);
	}
	
	@Test (dependsOnMethods = {"registerTest","loginTest"})
	public void SearchTest()
	{
		Reporter.log("Search Test Case",true);
	}
}
