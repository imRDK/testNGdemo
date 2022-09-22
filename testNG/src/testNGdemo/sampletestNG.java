package testNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sampletestNG {
	
	
	@Test
	public void VerifyLoginWithValidCredintials()
	{
	
	  System.out.println("This TC will verify the Login");
	  System.setProperty("webdriver.edge.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Utility\\edgedriver_win64\\msedgedriver.exe");
	
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.tutorialsninja.com/demo/");
	  
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	  driver.findElement(By.linkText("Login")).click();
	  driver.findElement(By.id("input-email")).sendKeys("kadamrajesh1991@gmail.com");
	  driver.findElement(By.id("input-password")).sendKeys("123456");
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	  
	  Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
	  
	  driver.quit();
	  
	}
	@Test
	public void verifyLoginWithInvalidCredentials()
	{
		 System.out.println("This TC will verify the Login");
		  System.setProperty("webdriver.edge.driver","C:\\Users\\Rajesh\\eclipse-workspace\\Utility\\edgedriver_win64\\msedgedriver.exe");
		
		  WebDriver driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.tutorialsninja.com/demo/");
		  
		  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		  driver.findElement(By.linkText("Login")).click();
		  driver.findElement(By.id("input-email")).sendKeys("kadamrajesh1991@gmail.com");
		  driver.findElement(By.id("input-password")).sendKeys("1234");
		  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		  
		  Assert.assertTrue(driver.findElement(By.linkText("Edit your  information")).isDisplayed());
		  
		  driver.quit();
		
		
		
	}
	
	
	 
}	  
	
		
		
			
		
	


