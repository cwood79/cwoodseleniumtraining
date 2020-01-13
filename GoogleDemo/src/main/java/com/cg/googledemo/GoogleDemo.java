package com.cg.googledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {
 public static void main(String[] args)
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	/*	
		driver.get("http://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("Selenium");
		
		search.submit();  */
		
	//	WebElement about = driver.findElement(By.linkText("About"));
//		about.click();
		
		driver.get("http://www.github.com/login");
		
		WebElement username=driver.findElement(By.id("login_field"));
		
		WebElement pass=driver.findElement(By.id("password"));
		
		WebElement button=driver.findElement(By.name("commit"));
		
		
		username.sendKeys("foo");
		pass.sendKeys("bar");
		

		button.click();	
 }
}
