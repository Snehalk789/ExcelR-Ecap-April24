package day3_03_06_2024;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(	a.getText());
		a.sendKeys("Snehal");
		a.accept();
		

	}

}
