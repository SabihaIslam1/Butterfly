package Trial1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	
	@Test(priority=1,groups="Title")
	public void GoogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2, groups="Title")
	public void googlelogotest() {
		boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
		
	}
	@Test(priority=3,groups="Logo")
	public void maillinkcheck() {
		boolean b = driver.findElement(By.linkText("About")).isDisplayed(); 
		
	}
	
	@Test(priority=4, groups= "Likned test")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5, groups= "Test")
	public void test2() {
		System.out.println("test1");
	}
	@Test(priority=6, groups= "Test")
	public void test3() {
		System.out.println("test1"); 
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
}
