package com.cg.googledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://html.com/input-type-file/");
		
		WebElement fileUpload=driver.findElement(By.name("fileupload"));
		
		fileUpload.sendKeys("C:\\installerLog.txt");
		fileUpload.submit();
	}
}
