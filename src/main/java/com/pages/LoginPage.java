package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 


public class LoginPage {
	
	private WebDriver driver;
	private String TestLoginPage;
	
	/*
	 * By Locators
	 * */
	private By Login = By.xpath("//span[text()='Log In']");
	private By Email = By.xpath("//input[@name='email']");
	private By Password = By.xpath("//input[@name='password']");
	private By LoginBtn = By.xpath("//div[@class='ui fluid large blue submit button']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * Creating Page objects methods
	 * */
	public void clickOnLoginButtonMainPage(){
		driver.findElement(Login).click();
	}
	
	public void provideUsernameAndPassword(String Username, String password) {
		driver.findElement(Email).click();
		driver.findElement(Email).sendKeys(Username);
		
		driver.findElement(Password).click();
		driver.findElement(Password).sendKeys(password);
	}
	
		
	public void clickOnLoginButton() throws InterruptedException {
		driver.findElement(LoginBtn).click();
		Thread.sleep(5000);
	}
	

}
