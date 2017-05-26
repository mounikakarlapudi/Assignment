package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wordpress.Pages.LoginPage;

public class VerifyWordpressLogin {
	
	public void VerfyValidLogin(){
		
		WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	
	driver.manage().window().maximize();
	driver.get("https://wordpress.com/wp-login.php");
	
	LoginPage login= new LoginPage(driver);
	
	login.typeUserName();
	login.typePassword();
	login.clickOnButton();
	
	driver.quit(); 
	}
	
	

}
