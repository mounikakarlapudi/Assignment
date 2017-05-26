package co.selenium.webdriver.programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
 private static Program1 myObj;
WebDriver driver;
  
 public void invokeBrowser(){
	 
	 
	 try {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		 
		 driver.get("http://www.edureka.co");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
 }
 
 public void searchCourse(){
	 try {
		 driver.findElement(By.id("search-inp1")).sendKeys("java");
		 Thread.sleep(3000);
		 driver.findElement(By.id("search-button-button")).click();
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
 }
 
	public static void main(String []args){
		
		Program1.myObj= new Program1();
		myObj.invokeBrowser();
		
	
	}
}
