package com.selenium.test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.test.components.HomepageSearch;
import com.selenium.test.components.Login;
import com.selenium.test.tools.Tools;

public class Sample1 {

	@Test
	public void testGoogleSearch() throws InterruptedException, IOException {

		Tools tools = new Tools();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.accorhotels.com");
		Thread.sleep(5000);
		
		driver.get("https://secure.accorhotels.com/authentication/login.jsp?appContext=&lang=fr&forceLogin=true&gotoUrl=http%3A%2F%2Fwww.accorhotels.com%2Ffr%2Ffrance%2Findex.shtml");

		Login login = new Login(driver);
		login.typeUsername("jlechardeur@gmail.com");
		login.typePassword("nellysimon1");
		login.submitLogin();
		Thread.sleep(5000);
		tools.takeScreenShot("C:\\dev\\screenshot_login.png", driver);

		HomepageSearch homepageSearch = new HomepageSearch(driver);
		homepageSearch.typeDestination("lille");
		homepageSearch.submitSearch();
		// temporisation
		Thread.sleep(5000);
		tools.takeScreenShot("C:\\dev\\screenshot_liste_hotel.png", driver);

		//on prend le premier elemnt
		driver.findElement(By.xpath("//*[@id=\"0902\"]/div/div/div[2]/div[3]/a[2]/span")).submit();

		// driver.quit();
	}
}
