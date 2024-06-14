package day2_31_05_2024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int totalLinks=links.size();
		System.out.println("Total no of links:"+totalLinks);
		
		for(int i=0;i<totalLinks;i++) {
			//System.out.println(links.get(i).getText());
			String link=links.get(i).getText();
			if(link.startsWith("A")==true) {
				System.out.println(link);
			}
		}
	}

}
