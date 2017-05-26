package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// this class will store all locators of Login page
public class LoginPage {
	
	WebDriver driver;// to  help us to perform activity in web pages
	
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id='user_pass']");
	By loginButton=By.name("wp-submit");
	
	
	//creating constructor 
	public LoginPage(WebDriver driver){// constructor to intialize task
		this.driver= driver;
		
	}
	
public void typeUserName(){
	driver.findElement(username).sendKeys("admin");
	
}

public void typePassword(){
	driver.findElement(password).sendKeys("demo123");
	
}
public void clickOnButton(){
	driver.findElement(loginButton).click();
}
}


