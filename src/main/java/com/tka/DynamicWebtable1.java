package com.tka;

import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import dev.failsafe.function.AsyncSupplier;

public class DynamicWebtable1 {
	
	@Test
	public void testDynamictable1()
	{
		ArrayList<String> alexpResult= new ArrayList<String>();
		alexpResult.add("Category ID");
		alexpResult.add("Category Name");
		alexpResult.add("Created At");
		alexpResult.add("Modified At");
		alexpResult.add("Actions");
		ArrayList<String> alactResult= new ArrayList<String>();
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://javabykiran.com/selenium/admin.html");
	    for(int i=1;i<=5;i++)
	    {
	    	String actColumn= driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th["+i+"]")).getText();
	    	System.out.println(actColumn);
	    	alactResult.add(actColumn);
	    	}
	    driver.close();
	    Assert.assertEquals(alactResult, alexpResult);
	 
	} 

}
