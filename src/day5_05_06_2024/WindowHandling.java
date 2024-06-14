package day5_05_06_2024;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.linkText("FLIGHTS")).click();
		//driver.findElement(By.linkText("Bus Tickets")).click();
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window Id:"+parentWindow);
		
		Set<String> childWindows= driver.getWindowHandles();
		System.out.println("Child Window Id:"+childWindows);
		
		Iterator itr=childWindows.iterator();
		while(itr.hasNext()) {
			String childWindow=(String) itr.next();
			if(!parentWindow.equals(childWindow)){
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				driver.findElement(By.linkText("Bus Tickets")).click();
				System.out.println(driver.getTitle());
				driver.close();
			}
		
		}
		
		driver.quit();
	}

}
