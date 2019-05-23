package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;


	@Test
	@Parameters({"env", "browser", "url", "emailID"})
	public void yahoologinTest(String env, String browser, String url , String emailID) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabih\\eclipse-workspace\\TestNG1\\Library\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\sabih\\eclipse-workspace\\com.test\\Library\\Firefox\\geckodriver.exe");
			driver= new FirefoxDriver();
		}	

		driver.get(url);


		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailID);//enter the username
		driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();//click on next button


	}


}
