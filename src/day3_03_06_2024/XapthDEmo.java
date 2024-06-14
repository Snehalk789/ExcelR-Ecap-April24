package day3_03_06_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XapthDEmo {

	public static void main(String[] args) throws Throwable {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.linkText("Create new account")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("xuv@gmail.com");
			driver.findElement(By.xpath("//input[@value='1']")).click();
			driver.findElement(By.xpath("//input[@value='2']")).click();
			driver.findElement(By.xpath("//input[@value='-1']")).click();
	}

}
