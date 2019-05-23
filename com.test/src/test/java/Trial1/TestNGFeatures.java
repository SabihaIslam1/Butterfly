package Trial1;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void LoginTest() {
		System.out.println("login test");
	
	}
	@Test(dependsOnMethods ="LoginTest" )
	public void SearchPageTest() {
		System.out.println("homepage test");
	}
	
	@Test(dependsOnMethods ="LoginTest" )
	public void RegPageTest() {
		System.out.println("Regpagetest");
	}
	
	@Test(dependsOnMethods ="LoginTest" )
	public void HighPageTest() {
		System.out.println("HighPageTest");
	}

}
