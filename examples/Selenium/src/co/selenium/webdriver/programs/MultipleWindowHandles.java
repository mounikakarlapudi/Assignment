package co.selenium.webdriver.programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleWindowHandles {

	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.cssSelector("#terms-link")).click();
			System.out.println(driver.getTitle());
			
		    Set<String>ids=driver.getWindowHandles();
		    Iterator<String> it=ids.iterator();
		    String parentid = it.next();
		    String childid = it.next();
		    driver.switchTo().window(childid);
		    System.out.println(driver.getTitle());
			
		
	

}

}