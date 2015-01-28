package com.selenium.test.tools;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Tools {

	public Tools() {
	}

	public void takeScreenShot(String pathToSave, WebDriver driver) throws IOException {
		File screenshot = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(pathToSave));
	}
}
