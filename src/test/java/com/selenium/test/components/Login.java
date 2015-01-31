package com.selenium.test.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	private final WebDriver driver;
	
	By usernameField = By.id("login");
    By passwordField = By.id("pwd");
    By loginButtonLocator = By.id("login-submit");
	
	public Login(WebDriver driver) {
        this.driver = driver;
    }
		
    public Login typeUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        return this;    
    }

    public Login typePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;    
    }

    public Login submitLogin() {
        driver.findElement(loginButtonLocator).submit();
        return this;    
    }

}
