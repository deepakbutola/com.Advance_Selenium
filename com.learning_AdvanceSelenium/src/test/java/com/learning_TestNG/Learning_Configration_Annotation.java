package com.learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Learning_Configration_Annotation {

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Executing before suite",true);

	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("Executing after suite",true);
	}

	@BeforeTest
	public void beforeTest()
	{Reporter.log("Executing before test",true);}
	
	@AfterTest
	public void afterTest()
	{Reporter.log("Executing After Test",true);}
	
	@BeforeClass
	public void beforeClass()
	{Reporter.log("Executing before class",true);}
	
	@AfterClass 
	public void afterClass()
	{Reporter.log("Executing after class",true);}
	
	@BeforeMethod
	public void beforeMethod()
	{Reporter.log("Executing before methods",true);}
	
	@AfterMethod
	public void afterMethod()
	{Reporter.log("Executing after method",true);}
	
	@Test
	public void Logintest()
	{Reporter.log("Executing test()",true);}
}
