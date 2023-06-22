package meesho;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public  class meeshonew
{

	
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
		public void mesh()
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/div[1]/input")).sendKeys("saree");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[5]")).click();
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/div/div[6]/div/div[3]/a[5]/p")).click();
			String Titles=driver.getTitle();
			if(Titles.equals("meesho.com"))
			{
				System.out.println("Title verified");
			}
			else
			{
				{
					System.out.println("Title is not verified");
				}}
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/div/div/div[2]/div[2]/div[24]/div[14]/div[2]/div/span[3]/a")).click();
			JavascriptExecutor Js=(JavascriptExecutor)driver;
			Js.executeScript("window.scrollBy(0,1000)","");
				}
			
			
	}