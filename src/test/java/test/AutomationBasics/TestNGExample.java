package test.AutomationBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {
	
	@BeforeSuite
	public void beforeSuiteTest(){
		System.out.println("This is Before Suite");
	}
	
	@AfterSuite
	public void afterSuiteTest(){
		System.out.println("This is After Suite");
	}

	@BeforeTest
	public void beforeTest(){
		System.out.println("This is Before Test");
	}
	
	@Test(priority = 0)
	public void firstTest(){
		System.out.println("This is first Test");
	}
	
	@Test(priority = 1)
	public void secondTest(){
		System.out.println("This is second Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("This is After Test");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("This is Before Class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("This is After Class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("This is Before Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("This is After Method");
	}
}
