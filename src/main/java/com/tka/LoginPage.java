package com.tka;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginPage 
{

	@Test (enabled=false)
	public void TestMainHeading()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult=driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		System.out.println(actResult);
		String expResult="Welcome Back";
		driver.quit();
	    Assert.assertEquals(actResult,expResult);
		
	}
	
	
	@Test (enabled=false)
	public void TestSubHeading()
	   {
		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
	    String actResult= driver.findElement(By.xpath("/html/body/div/div/p")).getText();
	    System.out.println(actResult);
		String expResult="Welcome here";
		driver.quit();
	    Assert.assertEquals(actResult,expResult);
	   }
	
	
	@Test (enabled=false)
	public void TestTitle()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		String actResult=driver.getTitle();
		System.out.println(actResult);
		String expResult="Login-JBK";
		driver.quit();
		Assert.assertEquals(actResult, expResult);
	}

    @Test (enabled=false)
    public void TestUserNameLable()
    {
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	String actResult=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/label")).getText();
	System.out.println("actResult");
	String expResult="username";
	driver.quit();
	Assert.assertEquals(actResult, expResult);
	
	}
    
    @Test (enabled=false)
    public void TestPasswordLable()
    {
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	String actResult=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/label")).getText();
	System.out.println("actResult");
	String expResult="Password";
	driver.quit();
	Assert.assertEquals(actResult, expResult);
	
	}
    
  
    @Test (enabled=false)
    public void TestUsernameText()
    {
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	String actResult=driver.findElement(By.xpath("//*[@id=\"username\"]")).getText();
	System.out.println("actResult");
	String expResult="admin";
	driver.quit();
	Assert.assertEquals(actResult, expResult);
	
    }
    
    @Test (enabled=false)
    public void TestPasswordText()
    {
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	String actResult=driver.findElement(By.xpath("//*[@id=\"password\"]")).getText();
	System.out.println("actResult");
	String expResult="admin123";
	driver.quit();
	Assert.assertEquals(actResult, expResult);
	
    }
    
    @Test (enabled=false)
	public void TestValidLoginDetails()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String actResult="Login Successfully";
		String expResult="Login Invalid ";
		driver.quit();
		Assert.assertEquals(actResult,expResult );
	
	}
    
    @Test (enabled=false)
	public void TestInvalidLoginDetails()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
	    String actResult=	driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText(); 
	    String expResult="Login Successfully";
	    driver.quit();
		Assert.assertEquals(actResult,expResult);
	
	}
    
    @Test (enabled=false)
    public void TestAlert()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://javabykiran.com/selenium/admin.html");
    	driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).click();
		org.openqa.selenium.Alert al= driver.switchTo().alert();
		al.accept();
    }
    
    @Test (enabled=false)
    public void TestMaximize()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://javabykiran.com/selenium/admin.html");
    	driver.manage().window().maximize();
    	driver.quit();
    }
    
    
    @Test (enabled=false)
    public void TestNavigateback()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://javabykiran.com/selenium/admin.html");
    	driver.navigate().back();
    	driver.navigate().to("https://javabykiran.com/selenium/login.html");
    	String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://javabykiran.com/selenium/login.html", currentUrl);
    	
    	
    }
    
    @Test
    public void TestNavigateforward()
    {
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://javabykiran.com/selenium/login.html");
    	driver.navigate().forward();
    	driver.navigate().to("https://javabykiran.com/selenium/admin.html");
    	String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://javabykiran.com/selenium/admin.html", currentUrl);
    }
    
    
}
    
    
    
    
    
    
    
