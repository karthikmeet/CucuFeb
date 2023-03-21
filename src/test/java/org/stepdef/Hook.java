package org.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {

	public static WebDriver driver;

	@Before
	public static void launchBrowser() {
		System.out.println("Before - Hook - Launch Browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public static void closeBrowser() {
		System.out.println("After - Hook - Launch Browser");
		driver.close();
	}
}
