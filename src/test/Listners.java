package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{	

	  @Override		
	    public void onTestFailure(ITestResult arg0) {					
		  System.out.println("Test failed [X]... "+arg0);
	    }
	  
	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	    	System.out.println("Test Started [*]... "+arg0);	        		
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	    	System.out.println("Test Passed [V]... "+arg0);				   		
	    }
}
//For listners to work, we need to configure 'listners' in testng.xml file, and execute test with xml file
//After 'suite' tag  declare declare the listner class name in listner tag
//<suite name="Loan Department">
//<listeners>
//<listener class-name="test.Listners" />
//</listeners>
//<test> ....
