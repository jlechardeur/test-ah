package com.selenium.test.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelsList {

	private final WebDriver driver;

	public HotelsList(WebDriver driver) {
		this.driver = driver;
	}

	public HotelsList clickOnFirstResult() {
		driver.findElements(
				By.xpath("//*[@class=\"blocHotelWrapper\"]/div/div[2]/div[3]/a[2]/span"))
				.get(0).click();
		return this;
	}
	
	public HotelsList clickOnResultX(int index) {
		driver.findElements(
				By.xpath("//*[@class=\"blocHotelWrapper\"]/div/div[2]/div[3]/a[2]/span"))
				.get(index).click();
		return this;
	}

}
