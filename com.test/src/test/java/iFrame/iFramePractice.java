package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class iFramePractice extends BaseClass {
	
	//package list Frame
	//By anytext = By.linkText("java.applet");
	
	
	@Test
	public void XpathPrac() {
		OpenChrome("https://docs.oracle.com/javase/8/docs/api/");
		
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("AbstractAction")).click();
		
		driver.switchTo().frame(1);
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[.='ActiveEvent']/@href")));
		
				//WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
		
		driver.findElement(By.linkText("ActiveEvent")).click();
		
	}

	
}
