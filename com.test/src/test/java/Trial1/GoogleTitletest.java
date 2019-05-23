package Trial1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitletest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabih\\eclipse-workspace\\TestNG1\\Library\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test()
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		
		//Validation is the most important thing in Testcases
		Assert.assertEquals(title, "Google", "title is not matched" );
	}

	@Test(priority=2, groups="Title")
	public void googlelogotest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		//Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
