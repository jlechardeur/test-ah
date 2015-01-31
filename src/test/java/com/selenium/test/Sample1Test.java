package com.selenium.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.test.components.HomepageSearch;
import com.selenium.test.components.HotelsList;
import com.selenium.test.components.Login;
import com.selenium.test.components.RoomDates;
import com.selenium.test.tools.Tools;

public class Sample1Test {

	@Test
	public void testHomepageSearch() throws InterruptedException, IOException {

		Tools tools = new Tools();

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.accorhotels.com");
		Thread.sleep(5000);
		
		//driver.get("https://secure.accorhotels.com/authentication/login.jsp?appContext=&lang=fr&forceLogin=true&gotoUrl=http%3A%2F%2Fwww.accorhotels.com%2Ffr%2Ffrance%2Findex.shtml");

		//Login login = new Login(driver);
		//login.typeUsername("jlechardeur@gmail.com");
		//login.typePassword("nellysimon1");
		//login.submitLogin();
		//Thread.sleep(5000);
		//tools.takeScreenShot("C:\\dev\\screenshot_login.png", driver);

		HomepageSearch homepageSearch = new HomepageSearch(driver);
		homepageSearch.typeDestination("chilly mazarin");
		homepageSearch.submitSearch();
		// temporisation
		Thread.sleep(5000);
		tools.takeScreenShot("C:\\dev\\screenshot_liste_hotel.png", driver);
		

		//on prend le premier element
		HotelsList hotelList = new HotelsList(driver);
		hotelList.clickOnFirstResult();
		Thread.sleep(5000);
		tools.takeScreenShot("C:\\dev\\screenshot_room-dates.png", driver);
		
		RoomDates roomDates = new RoomDates(driver);
		roomDates.fillDate(null, 0);
		Thread.sleep(5000);
		//je prends le premier bouton de la page rates
		driver.findElement(By.xpath("//*[@id=\"resultTemplate\"]/div[1]/div/div/div[2]/div[2]/div[2]/a")).click();
		
		//pages options
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"optionTotalTemplate\"]/ul/li[2]/a")).click();
		
		driver.quit();
	}
}
