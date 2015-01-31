package com.selenium.test.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomepageSearch {
	
	private final WebDriver driver;
	
	By searchField = By.name("search.destination");
    By searchButtonLocator = By.id("search-destination-boo");
	
	public HomepageSearch(WebDriver driver) {
        this.driver = driver;
    }
		
    public HomepageSearch typeDestination(String destination) {
        driver.findElement(searchField).sendKeys(destination);
        return this;    
    }

    public HomepageSearch submitSearch() {
        driver.findElement(searchButtonLocator).submit();
        return this;    
    }
}
