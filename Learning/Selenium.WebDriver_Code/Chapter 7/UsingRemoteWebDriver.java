package com.packt.webdriver.chapter7;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UsingRemoteWebDriver {
	public static void main(String... args){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("firefox");
		RemoteWebDriver remoteWD = null;
		try {
			remoteWD = 
					new RemoteWebDriver(new URL("http://<remote-webdriver-ip>:4444/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		remoteWD.get("http://www.google.com");
		WebElement element = remoteWD.findElement(By.name("q"));
		element.sendKeys("Packt Publishing");
	}
}
