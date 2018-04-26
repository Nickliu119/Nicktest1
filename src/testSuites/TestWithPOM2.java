package testSuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects2.Shpingtai2;;


public class TestWithPOM2 {
	 
	public class AssertTest{
		
	
	 WebDriver driver;
	
	@BeforeClass
	public void setUp() throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sh.qfpay.com");
		Thread.sleep(2000);
		
	}
     
	@Test
	public void testLogin() throws InterruptedException{
		
		Shpingtai2 hp = PageFactory.initElements(driver, Shpingtai2.class);
		hp.login("15001033574", "654321");
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.linkText("首页概览")).isDisplayed());
		System.out.println("登录测试成功");
		driver.close();
	}	
  } 
}
