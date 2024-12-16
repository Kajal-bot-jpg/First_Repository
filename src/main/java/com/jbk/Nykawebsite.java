package com.jbk;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Nykawebsite {
	@Test 
	public void testTitleOfWebsite()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		String actResult=driver.getTitle();
	    System.out.println(actResult);
		String expResult="Login-JBK";
		driver.close();
		Assert.assertEquals(actResult, expResult,"Title does not match!");
	}
	
	
	@Test
	public void testSinginButton()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div[1]/button")).click();
		String actResult=driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div[2]/div[1]")).getText();
		String expResult="create account of nyka ";
		driver.close();
		Assert.assertEquals(actResult, expResult);
		
	}
	
	@Test
	public void testLoginCredentials()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[1]/div[2]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div/div[2]/div/section/div/form/div[1]/div/input")).sendKeys("8308308497");
		driver.findElement(By.xpath("//*[@id=\"submitVerification\"]")).click();
		String actResult = driver.getCurrentUrl();
		String expResult = "https://www.nykaa.com/home";
		driver.close();
		Assert.assertEquals(actResult, expResult);
		
	}	
	
	@Test
	public void testSearchFunctionality()
	{
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.nykaa.com/");
	    driver.findElement(By.id("SearchInputBox")).sendKeys("lipstick");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    String actResult = driver.getCurrentUrl();
	    System.out.println("Current URL after search: " + actResult);
	    String expResult = "https://www.nykaa.com/search/result/?q=lipstick"; 
	    driver.close();
	    Assert.assertTrue(actResult.contains("lipstick"), "Search functionality failed!");
	}
	
	@Test
	public void testAddToCart() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.nykaa.com/");
	    driver.findElement(By.xpath("//a[contains(text(),'Lipstick')]")).click(); 
	    driver.findElement(By.xpath("//button[contains(text(),'Add to Bag')]")).click();
	    String actResult = driver.findElement(By.id("cart-count")).getText(); 
	    System.out.println("Cart Count: " + actResult);
	    String expResult = "1"; 
	    driver.close();
	    Assert.assertEquals(actResult, expResult, "Item was not added to the cart!");
	}
	
	@Test
	public void testAddtoCart()
	{
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.nykaa.com/");
	    driver.findElement(By.xpath("//*[@id=\"header_id\"]/div[2]/div/div[2]/div[2]/button/svg")).click();
	   String actResult= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div/div/div/p[1]")).getText();
	   String expResult=" Mabellin Foundation";
	   driver.close();
	   Assert.assertEquals(actResult, expResult);
	    
	}
	
	
	@Test
	public void testFilter()
	{
		WebDriver driver = new ChromeDriver();
	    driver.get(" https://www.nykaa.com/sp/makeup-clp-desktop/makeup");
	    driver.findElement(By.xpath("//*[@id=\"my-menu\"]/ul/li[1]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"filters-strip\"]/div/div/div[2]/div")).click();
	    
	    
	
	}
}
