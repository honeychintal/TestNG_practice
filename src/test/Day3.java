package test;

import org.testng.annotations.Test;

public class Day3 {

	@Test(groups = {"smoke"})
	public void webLoginHomeLoan()
	{
		System.out.println("class Day3 webLoginHome");
	}
	
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("class Day3 mobileLoginHome");
	}

	@Test(groups = {"regression"})
	public void loginApiHomeLoan()
	{
		System.out.println("class Day3 LoginApiHome");
	}
}
