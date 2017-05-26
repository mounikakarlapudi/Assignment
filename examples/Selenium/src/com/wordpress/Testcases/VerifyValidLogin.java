package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.wordpress.Pages.LoginPageNew;

import Helper.BrowserFactory;

public class VerifyValidLogin {
	
	
	
	public void checkValidUser(){
		
		
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://www.wordpress.com");
		
		LoginPageNew login_page=PageFactory.initElements(driver,LoginPageNew.class);
	}
	
	
	

}
