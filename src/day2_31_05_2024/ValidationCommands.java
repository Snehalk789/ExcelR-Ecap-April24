package day2_31_05_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean emailTextBox = driver.findElement(By.id("email")).isDisplayed();
		if (emailTextBox == true) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
		
		boolean passTextbox=driver.findElement(By.id("pass")).isEnabled();
		if(passTextbox==true) {
			System.out.println("Pass");
		}
		
		else {
			System.out.println("Fail");
		}
		
	}

}
