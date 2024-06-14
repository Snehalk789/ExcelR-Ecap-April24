package day6_06_06_2024;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg4 {
	//@BeforeMethod
	//@Test
	//@AfterMethod
	//@BeforeMethod
	//@Test
	//@AfterMethod
	WebDriver driver;
   @Test(priority=1)
	public void enterUrl() {
		System.out.println("Test case 1");
		driver.get("https://www.facebook.com/");
	}
   @BeforeMethod
	public void openBrowser() {
		System.out.println("Browser is opned");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
   @AfterMethod
	public void closeBrowser() {
		System.out.println("Browser is closed");
		driver.close();
	}
   @Test(priority=2)
	public void enterUrl2() {
		System.out.println("Test case 2");
		driver.get("https://www.flipkart.com/");
	}
}