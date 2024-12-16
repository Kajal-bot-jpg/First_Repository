package com.tka;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManagerOutput;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DropdownTestCase {
	
	@Test (enabled=false)
	public void testListCountoptions()
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/admin.html");
	driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
	WebElement list=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
     Select select = new Select(list);
     List<WebElement>options=select.getOptions();
     for(WebElement webElement:options) 
     {
    	 String textofoptions=webElement.getText();
    	 System.out.println(textofoptions);
     }
     driver.quit();
     assertEquals(options.size(), 4);
	 
	 
	
	}
	
	@Test (enabled=false)
	public void testselectoptions()
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/admin.html");
	driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
	WebElement list=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
    Select select = new Select(list);
    List<WebElement>options=select.getOptions();
    ArrayList<String> alactResult=new ArrayList<String>();
    for(WebElement webElement:options)
    {
    	String text= webElement.getText();
    	alactResult.add(text);
    }
    driver.quit();
    Assert.assertTrue(alactResult.contains("Science"));
	}
	
	@Test (enabled=false)
	public void testIndex()
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/admin.html");
	driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
	WebElement list=driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
	Select select = new Select(list);
	ArrayList<String> alactResult=new ArrayList<String>();
    List<WebElement>options=select.getOptions();
    
    for (WebElement webElement : options)
    {
    	
		String data=webElement.getText();
		alactResult.add(data);
	}
		
     int index=alactResult.indexOf("Science");
     Assert.assertEquals(index, 3);
    	
	}  
	
	@Test (enabled=false)
	public void testNavigationAfterDropdownSelection() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://javabykiran.com/selenium/admin.html");
	    driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]"));
	    WebElement list = driver.findElement(By.xpath("//*[@id=\"parent-category\"]"));
	    Select select = new Select(list);
	    select.selectByVisibleText("Science"); 
	    driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
	    driver.navigate().to("https://javabykiran.com/selenium/admin.html");
    	String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://javabykiran.com/selenium/admin.html", currentUrl);
	    driver.quit();   
	}
	
	@Test
	public void testRefreshlist()
	{
	WebDriver driver= new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	driver.findElement(By.xpath("//*[@id=\"country\"]")).click();
	WebElement list=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[26]/td[1]/span"));
     Select select = new Select(list);
     List<WebElement>options=select.getOptions();
     for(WebElement webElement:options) 
     {
    	 String textofoptions=webElement.getText();
    	 System.out.println(textofoptions);
     }
     driver.quit();
     assertEquals(options.size(), 12);
	
	}
	
    }
	


