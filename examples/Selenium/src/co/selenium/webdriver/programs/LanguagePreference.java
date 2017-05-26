package co.selenium.webdriver.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class LanguagePreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments(“–(String[]) (lang= sl)”);
		ChromeDriver driver1 = new ChromeDriver(options);
		driver1.get(“http://google.co.in&#8221;);
	}

}
