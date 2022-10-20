package com.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static String ambilGambar(WebDriver webdriver, String namaFile) throws IOException{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot screenShoot =((TakesScreenshot) webdriver);
		File srcFile = screenShoot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\test-output\\hasilScreenshoot\\"+"_Testscreenshoot_"+namaFile+dateName+".png";
		File destFile = new File(destination);
		//menjadikan gambar ke file
		FileUtils.copyFile(srcFile, destFile);
		
		return destination;
	}
}
