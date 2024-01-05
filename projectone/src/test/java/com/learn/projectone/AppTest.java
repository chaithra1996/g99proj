package com.learn.projectone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/fresher/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("chaitranagraj800@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("t9zqaEB@");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
