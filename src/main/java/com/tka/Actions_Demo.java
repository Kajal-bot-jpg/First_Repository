package com.tka;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actions_Demo {
	
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("selenium.dev",Keys.ENTER);
	}
		
		
	}

