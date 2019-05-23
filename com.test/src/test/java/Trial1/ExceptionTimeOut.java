package Trial1;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	
	@Test(invocationTimeOut = 2, expectedExceptions = NumberFormatException.class)// how long it should any test case take to execute?
	public void infiniteloopTest() {
		
		int i = 1 ;
		while (i==1) {
			System.out.println(i);
		}
	}
	
	//@Test(expectedExceptions = NumberFormatException.class)
	//public void test1() {
		//String x = "100A";
		//Integer.parseInt(x); 
	
		
	}


