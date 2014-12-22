package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class GooglrSearch {
	@Test
	public void GooglrSearchTest(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tester1\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in");	
		driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("Selenium webdriver");

	}
}
