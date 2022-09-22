package testNGdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practicetestNG {
	
	public String baseurl="https://www.amazon.in/";
	String driverpath="C:\\Users\\Rajesh\\eclipse-workspace\\testNG\\edgedriver_win64\\msedgedriver.exe";
	public WebDriver driver;

	@BeforeSuite
	public void b1()
	{
		System.setProperty("webdriver.edge.driver",driverpath);
		driver=new EdgeDriver();	
	}
	@BeforeTest
	public void b2()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
		System.out.println("URL is : " + driver.getCurrentUrl());
		System.out.println("Titile is : " + driver.getTitle());
	}
	
	@Test
	public void TC1()
	{
		String exp_title="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String act_title=driver.getTitle();
		if(act_title.equals(exp_title))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Assert.assertEquals(act_title,exp_title);
		
		
	}
	@AfterMethod
	public void a1()
	{
		driver.close();
	}
//	@AfterClass
//	public void a2()
//	{
//		System.out.println("Inside AfterClass");
//	}
//	@AfterTest
//	public void a3() 
//	{
//		System.out.println("Inside AfterTest");
//	}
//	@AfterSuite
//	public void a4()
//	{
//		System.out.println("Inside AfterSuite");
//	}
	
	
	

}
