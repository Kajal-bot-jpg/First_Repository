package com.tka;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWebtable3 {
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
}
