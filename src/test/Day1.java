package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("Hello I am Before Test !!");
	}
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("Byee After Test !!");
	}
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("my scope is global, i will be 1st before all Tests -START");
	}
	@AfterSuite
	public void afterSuiteMethod()
	{
		System.out.println("my scope is global, i will be Last after all Tests -END");
	}
	@BeforeMethod
	public void beforeMethods()
	{
		System.out.println("I AM BEFORE_METHOD I execute before every method -For class Day1");
	}
	@AfterMethod
	public void afterMethods()
	{
		System.out.println("I AM AFTER_METHOD I execute after every method -For class Day1");
	}
	
	@Test
	public void one()
	{
		System.out.println("class Day1 method one");
	}
	
	@Test
	public void two()
	{
		System.out.println("class Day1 method two");
	}
	@Parameters({"URL"}) //Execute with testng2.xml
	@Test
	public void three(String url)
	{
		System.out.println("value of @Parameter= "+url);
	}
}
