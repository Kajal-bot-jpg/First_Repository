package com.jbk;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWebsite {
	
	@Test 
	public void testDynamicNykaWebsite()
	{
		ArrayList<String> alexpResult= new ArrayList<String>();
		alexpResult.add("Mamaearth India's First Organic Bamboo Based Baby Wipes - 72...");
		alexpResult.add("Mamaearth Gentle Cleansing Shampoo For Babies");
		alexpResult.add("BESTSELLER\r\n"
				+ "Mamaearth Mineral Based Sunscreen For Babies SPF20+\r\n"
				+ "MRP:₹150\r\n"
				+ "₹143\r\n"
				+ "5% Off\r\n"
				+ "Get Free Product");
		alexpResult.add("Mamaearth Milky Soft Shampoo With Oats, Milk And Calendula For Babies");
		alexpResult.add("Mamaearth Baby Powder With Organic Oatmeal & Arrowroot Powde...");
		alexpResult.add("Mamaearth India's First Organic Bamboo Based Baby Wipes - 72...");
		
		ArrayList<String> alactResult= new ArrayList<String>();
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.nykaa.com/mamaearth-mom-baby-range/c/9872?transaction_id=727791c52b9141733419b625e2403abf&intcmp=nykaa:sp:mom-and-baby:mom-and-baby:brands-that-mothers-love:COLUMN_GRID_V2:3:Mamaearth:34610:727791c52b9141733419b625e2403abf");
	    for(int i=1;i<=6;i++)
	    {
	    	{
	    	  	String txt =driver.findElement(By.xpath(" //*[@id=\"product-list-wrap\"]/div["+i+"]/div/div[1]")).getText();
	    	  	alactResult.add(txt);
	        }
	    	
	    }
	    
	    Assert.assertEquals(alactResult, alexpResult);


    }
	
	
	
	
	
}
