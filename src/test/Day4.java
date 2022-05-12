package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day4 {

	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("I am BEFORE_CLASS, I will execute before class Day4");
	}
	@Test(groups = {"regression"})
	public void webLoginCarLoan()
	{
		System.out.println("class Day4 webLoginCar");
	}
	
	@Test
	public void mobileLoginCarLoan()
	{
		System.out.println("class Day4 mobileLoginCar");
	}

	@Test(groups = {"smoke"})
	public void LoginApiCarLoan()
	{
		System.out.println("class Day4 LoginApiCar");
	}
}
