package com.qa.factory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	/*ThreadLocal is a way to initialize parallel execution. Just in case if the execution is parallel happening
	 * across multiple Websites then an instance is created in the ThreadLocal for that particular browser
	 * */
	public WebDriver driver;
	public static ThreadLocal<WebDriver> t1Driver = new ThreadLocal<>();
	
	/*This method is used to initialize(set) the driver. We have provided the browser in the parameter
	 * and provided chrome and firefox based on the webdriver manager and it will initialize the particular webDriver
	 * 
	 * */
	public WebDriver initializeDriver(String browser) {
		System.out.println("Browser is "+browser);
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			t1Driver.set(new ChromeDriver());
			
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			t1Driver.set(new FirefoxDriver());
			
		}else {
			System.out.println("Please pass the correct browser "+browser);
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/*This is where we get the driver to be initialzed. 
	 * Synchronized -> If a parallel execution is happening then getDriver method will be called multipled times 
	 * hence we use synchronized so that this getDriver might be called mutliple times and will be synchronized for all
	 * the web browser instances
	 *
	 * */
	public static synchronized WebDriver getDriver() {
		return t1Driver.get();
	}
	
	
 
}
