package org.test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtusername = driver.findElement(By.xpath("email"));
		txtusername.sendKeys("Mady");  
		WebElement txtpswrd = driver.findElement(By.xpath("email"));
		txtpswrd.sendKeys("1998");
		WebElement button = driver.findElement(By.xpath("email"));
		button.click();
	}

}
