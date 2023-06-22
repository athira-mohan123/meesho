package test;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazon.home;


public class hometest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.meesho.com/");
	}
	@Test
	public void testlogin() throws Exception
	{
		meesho ob=new meesho(driver);
		ob.setvalues("mobilephones");
		ob.firstphone();
		ob.addtocart();
		//ob.selectcart();
		Thread.sleep(6000);
	}


}
