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
		driver.get("https://online.actitime.com/cisco2");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
			driver.findElement(By.name("pwd")).sendKeys("DgjTEH99");
			driver.findElement(By.cssSelector("input[name='remember']")).click();
			driver.findElement(By.xpath("//a[@id='loginButton']")).click();
			driver.findElement(By.linkText("Logout")).click();
			driver.close()
	}
}
