package com.learning.mavenlearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.jobs/en/jobs/2503582/quality-assurance-engineer-amazon-smart-vehicles");
	}
}
