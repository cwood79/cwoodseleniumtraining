package com.cg.googledemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://www.amazon.com");
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("t-shirt");
	
		search.submit();
		
		WebElement product=driver.findElement(By.linkText("Men's 2-Pack Loose-Fit Short-Sleeve Crewneck T-Shirts"));
		product.click();
		
		WebElement cartButton=driver.findElement(By.id("add-to-cart-button"));
		cartButton.click();
	}

}
