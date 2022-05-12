package test;

import org.testng.annotations.Test;

public class Day2 {

	@Test(groups = {"smoke"})
	public void A()
	{
		System.out.println("class Day2 method A");
	}
	
	@Test (groups = {"regression"})
	public void B()
	{
		System.out.println("class Day2 method B");
	}
}
