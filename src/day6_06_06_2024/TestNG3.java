package day6_06_06_2024;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG3 {
		@BeforeSuite
		public void beforeSuiteMethod() {
			System.out.println("before suite method");
		}
		@BeforeTest
		public void beforeTestMethod() {
			System.out.println("before test method");
		}

		@BeforeClass
		public void beforeClassMethod() {
			System.out.println("Before class method");
		}
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before method method");
		}
		@Test 
		public void testMethod() {
			System.out.println("Test method");
		}
		@AfterMethod
		public void afterMethod() {
			System.out.println("after method method");
		}
		@AfterClass
		public void afterClassMethod() {
			System.out.println("After class method");
		}
		@AfterTest
		public void afterTest() {
			System.out.println("After test method");
		}
		@AfterSuite
		public void  afterSuiteMethod() {
			System.out.println("After suite method");
		}

	

}
