package org.test.githubautomate;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Github {
	static WebDriver driver;
	
@Test
public void login() {
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
   driver.get("https://github.com/login");
   WebElement UserName = driver.findElement(By.xpath("(//input[@type ='text'])[1]"));
   UserName.sendKeys("vinithkumarashokan");
   WebElement UserPass = driver.findElement(By.xpath("(//input[@type ='password'])"));
   UserPass.sendKeys("Vini@sneha7754");
   WebElement Login = driver.findElement(By.xpath("//input[@type ='submit']"));
   Login.click();
   
   String par = driver.getWindowHandle();
	System.out.println(par);
	
  WebElement AddNew = driver.findElement(By.xpath("(//a [@href = '/new'])[3]"));
  AddNew.click();
  WebElement RepoName = driver.findElement(By.xpath("(//input [@type = 'text'])[5]"));
  RepoName.sendKeys("GithubAutomation");
  WebElement CreaRepo = driver.findElement(By.xpath("//span[text() ='Create repository']"));
  CreaRepo.click();
  
   
}
}
