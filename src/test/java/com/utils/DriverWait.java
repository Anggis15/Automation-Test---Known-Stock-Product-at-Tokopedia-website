package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait {
	public static WebDriverWait wait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		return wait;
}

}
