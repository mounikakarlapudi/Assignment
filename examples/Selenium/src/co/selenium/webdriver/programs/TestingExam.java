package co.selenium.webdriver.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingExam {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.homedepot.com");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("headerSearch")).sendKeys("hammer");
			Thread.sleep(3000);
			driver.findElement(By.id("headerSearchButton")).click();
			
		      JavascriptExecutor jse = (JavascriptExecutor)driver;
			  jse.executeScript("window.scrollBy(0,850)", "");
			
			driver.findElement(By.xpath(".//*[@id='side']/div/div/div[4]/div[2]/ul/li[2]/a/div/div")).click();
			
			Thread.sleep(3000);
			
			driver.close();
			
			Thread.sleep(2000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
