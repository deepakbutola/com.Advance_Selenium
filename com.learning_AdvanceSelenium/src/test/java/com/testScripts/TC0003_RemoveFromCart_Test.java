package com.testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.generic_Library.Webdriver_Utility;
import com.generic_Library.base_Test;

public class TC0003_RemoveFromCart_Test extends base_Test {

	@Test
	public void removeFromCart() throws Exception {

		Thread.sleep(1000);
	driver.findElement(By.partialLinkText("JEWELRY")).click();

		Webdriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Jewelry']")));
		driver.findElement(By.xpath("//a[text()='Black & White Diamond Heart']/../..//input[@value='Add to cart']")).click();

		Webdriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//span[text()='Shopping cart']")));
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.xpath("(//a[text()='Black & White Diamond Heart'])[2]/../..//input[@type='checkbox']")).click();
		driver.findElement(By.name("updatecart")).click();
	}
}
