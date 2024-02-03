package com.testScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.generic_Library.base_Test;

public class TC001_SearchTest extends base_Test {
@Test
public void TC001_Search_Test() throws InterruptedException 
{
	driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);
	Reporter.log("Login TestCase");
}
}
