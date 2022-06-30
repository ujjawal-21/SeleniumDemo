package Test.Maven_Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

	WebDriver driver;
	
	@BeforeMethod
	public void init(){
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test1() {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Java");
		element.clear();
		element.sendKeys("ujjawal Anand");
		element.clear();
	}
	@AfterMethod
	
	public void close() {
		driver.close();
	}
	}
	

