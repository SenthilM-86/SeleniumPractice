package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampleTestSuite {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void openGoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		int calc = 10/0;
		System.out.println(calc);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	/* (groups = {"GroupSample"}) */
	public void openBing() throws InterruptedException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.bing.com");
		Thread.sleep(3000);
		driver.quit();
	}
	
}
