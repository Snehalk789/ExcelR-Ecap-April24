package day3_03_06_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		//selecting a day
		WebElement day=  driver.findElement(By.id("day"));
		Select se=new Select(day);
		se.selectByIndex(24);
		
		//selecting a month
		WebElement month=driver.findElement(By.id("month"));
		Select se2=new Select(month);
		se2.selectByValue("7");
		
		//selecting a year
		WebElement year=driver.findElement(By.id("year"));
		Select se3=new Select(year);
		se3.selectByVisibleText("1990");
		
	}

}
