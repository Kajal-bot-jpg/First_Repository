package com.tka;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboard {
	
	    @Test  (enabled=false)
		public void TestPageTitle()
		{
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://javabykiran.com/selenium/subcategories.html");
		    String actResult = driver.getTitle();
		    System.out.println(actResult);
		    String expResult = "Subcategories - Java By Kiran";
		    driver.quit();
		    Assert.assertEquals(actResult, expResult);
		}
		
	    @Test (enabled=false)
		public void TestDashboardHeading()
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://javabykiran.com/selenium/login.html");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
			String actResult=driver.findElement(By.xpath("/html/body/header/div/h1")).getText();
			System.out.println(actResult);
			String expResult="admin panel";
			driver.quit();
			Assert.assertEquals(actResult, expResult);
		}
	    
	    @Test (enabled=false)
	    public void TestAddCategoryButton() 
	    {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://javabykiran.com/selenium/admin.html");
	        String actResult = driver.findElement(By.xpath("//*[@id=\"add-category\"]")).getText();
	        String expResult="Add Category";
	        driver.quit();
	        Assert.assertEquals(actResult, expResult);
	        
	        
	    }

			
		@Test (enabled=false)
		public void TestEditButton()
		{
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://javabykiran.com/selenium/admin.html");
		    String actResult = driver.findElement(By.xpath(" //*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[1]")).getText();
		    String expResult="Add Category";
		    driver.quit();
		    Assert.assertEquals(actResult, expResult);
		    
		    
		}
		
		@Test (enabled=false)
		public void TestDeleteButton()
		{
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://javabykiran.com/selenium/admin.html");
		    String actResult= driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[1]/td[5]/button[2]")).getText();
		    String expResult="Delete";
		    driver.quit();
		    Assert.assertEquals(actResult, expResult);
		    
		}
		
		@Test (enabled=false)
		public void TestAddSubcategoryButton()
		{
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://javabykiran.com/selenium/subcategories.html");
		    String actResult = driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).getText();
		    String expResult="Add Category";
		    driver.quit();
		    Assert.assertEquals(actResult, expResult);
		    
		   
		}
		
		@Test (enabled=false)
		public void TestAddSubcategorySaveButton()
		{
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://javabykiran.com/selenium/subcategories.html");
		    driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]"));
		    String actResult=  driver.findElement(By.xpath("//*[@id=\"subcategory-form\"]/div/button[1]")).getText();
		    String expResult="Add Category";
		    driver.quit();
		    Assert.assertEquals(actResult, expResult);
		}
		
		
		@Test (enabled=false)
		public void TestAddSubcatogoryName()
		{
			WebDriver driver= new ChromeDriver();
			driver.get("https://javabykiran.com/selenium/login.html");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
			driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
			driver.findElement(By.xpath("/html/body/header/nav/a[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"subcategory-name\"]")).sendKeys("Geometry");
			driver.findElement(By.xpath("//*[@id=\"subcategory-form\"]/div/button[1]")).click();
		    String element1 = driver.findElement(By.xpath("//*[@id=\"subcategories-table\"]/tbody/tr[3]/td[2]")).getText();
		    String expResult= "Geometry";
		    Assert.assertEquals(element1, expResult);
			
		}	
		
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
		
		@Test
		public void testDynamicWebtable3() {
			ArrayList<String> alexpResult = new ArrayList<String>();
			alexpResult.add("1");
			alexpResult.add("Mathematics");
			alexpResult.add("2024-11-07");
			alexpResult.add("2024-11-08");
			alexpResult.add("Edit Delete");
			alexpResult.add("2");
			alexpResult.add("Science");
			alexpResult.add("2024-11-07");
			alexpResult.add("2024-11-08");
			alexpResult.add("Edit Delete");

			ArrayList<String> alactResult = new ArrayList<String>();
			WebDriver driver = new ChromeDriver();
			driver.get("https://javabykiran.com/selenium/admin.html");
			for (int i = 1; i <= 2; i++)
		   {
				for (int j = 1; j <= 5; j++)

				{
					String txt = driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText();
					alactResult.add(txt);
				}
			}
			driver.quit();
	        Assert.assertEquals(alactResult, alexpResult);

		}
		
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
	    


