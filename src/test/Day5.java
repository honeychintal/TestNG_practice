package test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day5 {
	@Test(dataProvider = "getdata")
	public void dataProviderTest(String name,String password)
	{
		System.out.println("name: "+name);
		System.out.println("pass: "+password);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object data[][] =new Object[3][2];
		data[0][0] ="1ST USERNAME";
		data[0][1] ="1ST PASSWORD";
		
		data[1][0] ="2ND USERNAME";
		data[1][1] ="2ND PASSWORD";
		
		data[2][0] ="3RD USERNAME";
		data[2][1] ="3RD PASSWORD";
		return data;
	}
}
