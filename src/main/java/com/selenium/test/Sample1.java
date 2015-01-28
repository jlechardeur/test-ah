package com.selenium.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.test.components.Login;

public class Sample1 {
	
	@Test
	public void testGoogleSearch() throws InterruptedException, IOException {
	  // Optional, if not specified, WebDriver will search your path for chromedriver.
	  //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.accorhotels.com");
	  WebElement searchBox = driver.findElement(By.name("search.destination"));
	  searchBox.sendKeys("Lille");
	  Select adultNumber = new Select(driver.findElement(By.id("search-adultNumber-boo")));
	  adultNumber.selectByIndex(1);
	  driver.findElement(By.id("search-destination-boo")).submit();
	  Thread.sleep(10000);
	  //Take screenshot of result page
	  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshot, new File("c:\\dev\\screenshot.png"));
	  
	  driver.get("https://secure.accorhotels.com/authentication/login.jsp?appContext=&lang=fr&forceLogin=true&gotoUrl=http%3A%2F%2Fwww.accorhotels.com%2Ffr%2Ffrance%2Findex.shtml");	  
	  
	  Login login = new Login(driver);
	  login.typeUsername("jlechardeur@gmail.com");
	  login.typePassword("nellysimon1");
	  login.submitLogin();
	  
	  //driver.quit();
	}
}
