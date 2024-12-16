package com.tka;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWebtable4
{
	
	@Test
	public void testDynamictable4()
	{
		ArrayList<String> alexpResult= new ArrayList<String>();
		alexpResult.add("Categories");
		alexpResult.add("Subcategories");
		alexpResult.add("Logout");
		ArrayList<String> alactResult= new ArrayList<String>();
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://javabykiran.com/selenium/admin.html");
	    for(int i=1;i<=3;i++)
	    
	    	{
	    	  	String txt =driver.findElement(By.xpath("/html/body/header/nav/a["+i+"]\r\n")).getText();
	    	  	alactResult.add(txt);
	        }
	    driver.close();
	    Assert.assertEquals(alactResult, alexpResult);
	}
	   

}

	


