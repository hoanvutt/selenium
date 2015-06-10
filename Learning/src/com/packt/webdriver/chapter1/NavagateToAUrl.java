package com.packt.webdriver.chapter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavagateToAUrl {
	public static void main(String[] args){
		// For Chrome Driver on iMac -> Download on http://chromedriver.storage.googleapis.com/index.html
		System.setProperty("webdriver.chrome.driver", "/Users/vuth/selenium-2.46.0/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com.vn");
	}
}
