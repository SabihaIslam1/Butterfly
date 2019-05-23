package Trial1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup {
	
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabih\\eclipse-workspace\\TestNG1\\Library\\chromedriver.exe");

		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("SoftwaretestingHelp");
		element.sendKeys(Keys.ENTER);
		js.executeScript("window.scrollBy(0,1000)");
		}
	
	public static  void ScrollUP () {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		driver.get("http://www.google.com");
		js1.executeScript("window.scrollBy(,0)");
		
	}

		
	}
	
	

	
	

