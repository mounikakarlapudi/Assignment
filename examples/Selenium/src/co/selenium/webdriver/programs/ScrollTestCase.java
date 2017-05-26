package co.selenium.webdriver.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;
 
 
public class ScrollTestCase {
 
 public static void main(String[] args) throws Exception {
  
 // load browser
  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
 
 
 // maximize browser
  driver.manage().window().maximize();
 
 
  // Open Application
  driver.get("http://jqueryui.com");
  
 
  // Wait for 5 second
  Thread.sleep(5000);
 
 // This  will scroll page 400 pixel vertical
  ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
  
     
 }
 
}