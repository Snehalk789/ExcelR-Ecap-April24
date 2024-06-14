package day6_06_06_2024;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNg5 {
	/*@BeforeSuite
	 * @Test1
	 * @Test2
	 * @AfterSuite
	 * */

	@Test
	public void enterUrl() {
		System.out.println("test case 1");
	}
	@BeforeSuite
	public void openBrowser() {
		System.out.println("browser is opned");
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("browser is closed");
	}
	@Test
	public void enterUrl2() {
		System.out.println("test case 2");
	}
}
