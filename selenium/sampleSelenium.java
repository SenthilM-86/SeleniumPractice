package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class sampleSelenium {
	

@Test
public void SeleniumTests() throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement homelink = driver.findElement(By.partialLinkText("Home Page"));
		homelink.click();
		Thread.sleep(2000);
		WebElement editicon = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		editicon.click();
		Thread.sleep(2000);
		WebElement mailtext = driver.findElement(By.id("email"));
		mailtext.sendKeys("senthilmohan86@gmail.com");
		Thread.sleep(2000);
		WebElement appendtext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendtext.clear();
		appendtext.sendKeys("text");
		Thread.sleep(2000);
		WebElement getTextBox = driver.findElement(By.name("username"));
		String value = getTextBox.getAttribute("value");
		System.out.println(value);
		Thread.sleep(2000);
		WebElement clearTextBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearTextBox.clear();
		Thread.sleep(2000);
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		WebElement buttonicon = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
		buttonicon.click();
		
		Thread.sleep(2000);
		WebElement positionbutton = driver.findElement(By.id("position"));
		Point xypoint = positionbutton.getLocation();
		int xValue = xypoint.getX();
		int yValue = xypoint.getY();
		System.out.println("X Value is "+xValue+" Y Value is "+yValue);
		
		Thread.sleep(2000);
		WebElement colorbutton = driver.findElement(By.id("color"));
		String color = colorbutton.getCssValue("background-color");
		System.out.println("Button color is "+ color);
		

		Thread.sleep(2000);
		WebElement sizebutton = driver.findElement(By.id("size"));
		int height = sizebutton.getSize().getHeight();
		int width = sizebutton.getSize().getWidth();
		System.out.println("Height is "+ height+" Width is "+width);
		
		Thread.sleep(2000);
		WebElement homebutton = driver.findElement(By.id("home"));
		homebutton.click();
		
		driver.close();
		
	}

}
