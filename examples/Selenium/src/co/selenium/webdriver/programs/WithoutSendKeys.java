package co.selenium.webdriver.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class WithoutSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
	      
			driver.manage().window().maximize();
			
			driver.get("http://www.gmail.com");
	
	        driver.manage().window().maximize();
	        
	        WebElement send= driver.findElement(By.xpath(".//*[@id='identifierId']"));
            
	        ((JavascriptExecutor)driver).executeAsyncScript("argument[0].value='mounikakarlapudi24'",send);
	}
}
