package com.selenium.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	
	@Test
	public void testGoogleSearch() throws InterruptedException {
	  // Optional, if not specified, WebDriver will search your path for chromedriver.
	  //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.accorhotels.com");
	  WebElement searchBox = driver.findElement(By.name("search.destination"));
	  searchBox.sendKeys("Lille");
	  Select adultNumber = new Select(driver.findElement(By.id("search-adultNumber-boo")));
	  adultNumber.selectByIndex(1);
	  driver.findElement(By.id("search-destination-boo")).submit();

	  //driver.quit();
	}
}
