package com.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {
	private WebDriver driver;
	private String Test;
	
	/*By Locators used for the methods
	 * */
	private By ABC_Company = By.xpath("//b[text()='ABC Company']");
	private By HomePageList = By.xpath("//div[@id='main-nav']//span");
			
	//Constructor of the Home Page Class
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	/*Page actions, features (behaviour) of the page the form of methods*/
	public void verifyHomePageTitle() throws NoSuchElementException {
		String CompanyName = driver.findElement(ABC_Company).getText();
		/*try {
			Assert.assertEquals("ABC Company", CompanyName);	
			
		}catch(Exception e) {
			System.out.println("Assert Failed in Company Name inside verify Home Page Title");
			}*/
	}
	
	/*This method returns the Home Page List Count*/
	public int getHomePageListCount() {
		List<WebElement> elements = driver.findElements(HomePageList);
	    return elements.size();
	}
	
	public List<String> getHomePageList() {
		List<String> list = new ArrayList<>();
		List<WebElement> HomePageLists = driver.findElements( HomePageList);
		
		for(WebElement HomePage: HomePageLists) {
			String text = HomePage.getText();
			System.out.println(text);
			list.add(text);
		}
		
		return list;
	}
	
	

}
