package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	public  void OpenChrome (String Url) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabih\\eclipse-workspace\\TestNG1\\Library\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	

}
