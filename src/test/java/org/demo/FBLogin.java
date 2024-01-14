package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin {
	
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("asasikumar0505@gmail.com");
		WebElement passWord = driver.findElement(By.id("pass"));
		passWord.sendKeys("preethi0505");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		driver.quit();
		driver.get("https://www.amazon.in/");		
		
	}

}
