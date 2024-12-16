package com.tka;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWebtable2 {
	
	@Test
	public void testDynamictable2()
	{
		ArrayList<String> alexpResult= new ArrayList<String>();
		alexpResult.add("1");
		alexpResult.add("Mathematics");
		alexpResult.add("2");
		alexpResult.add("Science");
		ArrayList<String> alactResult= new ArrayList<String>();
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://javabykiran.com/selenium/admin.html");
	    for(int i=1;i<=2;i++)
	    {
	    	for(int j=1;j<=2;j++)
	    
	    
	    	{
	    	  	String txt =driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
	    	  	alactResult.add(txt);
	        }
	}
	    driver.close();
	    Assert.assertEquals(alactResult, alexpResult);

	}
}
