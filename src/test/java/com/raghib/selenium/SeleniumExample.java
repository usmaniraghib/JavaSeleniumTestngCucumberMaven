package com.raghib.selenium;

//NOTE :- Try to type one import statement then only import reference will be provided by eclipse.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TODO - TestNG and Cucumber code implementation is pending.
public class SeleniumExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver-116\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println("URL : "+url);
        driver.quit();
	}
}
