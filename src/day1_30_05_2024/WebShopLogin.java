package day1_30_05_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebShopLogin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("abc@gmail.com");
//		driver.findElement(By.id("Email")).clear();
		
		WebElement emailTextBox=driver.findElement(By.id("Email"));
		emailTextBox.sendKeys("abc@gmail.com");
		emailTextBox.clear();
		
		WebElement passTextBox=driver.findElement(By.id("Password"));
		passTextBox.sendKeys("abc@123");
		
		WebElement loginBtn=driver.findElement(By.className("button-1 login-button"));
		loginBtn.click();
		
		
	}

}
