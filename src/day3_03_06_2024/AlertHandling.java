package day3_03_06_2024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		//for handling an alert
		Alert al=driver.switchTo().alert();
		String alertText=al.getText(); //for getting a text of an alert 
		System.out.println(alertText);
		al.accept(); //for selecting a text
		
		
		
	}

}
