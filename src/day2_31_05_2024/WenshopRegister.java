package day2_31_05_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WenshopRegister {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Virat");
		driver.findElement(By.id("LastName")).sendKeys("Kohli");
		driver.findElement(By.id("Email")).sendKeys("vkohli@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Virat@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Virat@123");
		driver.findElement(By.id("register-button")).click();
		
	
	
	}

}
