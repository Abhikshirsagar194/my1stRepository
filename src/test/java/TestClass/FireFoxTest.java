package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFoxTest 
{
	@Test
	public void FireFoxTest() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
