package day4_04_06_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClk_DoubleClk {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement emailTxtbox=driver.findElement(By.id("email"));
		Actions act =new Actions(driver);
		emailTxtbox.sendKeys("abc");
		
		act.doubleClick(emailTxtbox).build().perform();
		act.contextClick(emailTxtbox).build().perform();
		
	}

}
