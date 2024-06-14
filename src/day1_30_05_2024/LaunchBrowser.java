package day1_30_05_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		
		//WebDriver driver=new ChromeDriver();
		//WebDriver==> interface
		//driver ===> instance of WebDriver /ref variable
		//ChromeDriver ==>class
		
		WebDriver driver=new EdgeDriver();//opening edge browser
		driver.manage().window().maximize();//maximizing the window
		Thread.sleep(2000);//pausing the execution for 2sec
		driver.close();  //for closing the window
		
	}

}
