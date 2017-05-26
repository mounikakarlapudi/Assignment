package co.selenium.webdriver.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class PopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.fireFox.driver", "C:\\selenium\\geckodriver-master");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://hdfcbank.com");
		driver.manage().window().maximize();
		
		//finding id of this page
		String homepage=driver.getWindowHandle();
		System.out.println(homepage);
		
		driver.findElement(By.xpath("//*[@id='loginsubmit']")).click();
		String popPage= driver.getWindowHandle();// it gives ids of all open windows
        System.out.println(popPage);
        
       Set<String> windows= driver.getWindowHandle();
	}

}
