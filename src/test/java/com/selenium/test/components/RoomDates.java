package com.selenium.test.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoomDates {
	
	private final WebDriver driver;

	public RoomDates(WebDriver driver) {
		this.driver = driver;
	}
	
	public RoomDates fillDate(String field, int index){
		driver.findElement(By.id("search-dateIn")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"dates\"]/fieldset/div[4]/a/span")).click();
		return this;
	}

}
