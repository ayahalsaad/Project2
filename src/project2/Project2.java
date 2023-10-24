package project2;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Project2 {
	WebDriver driver = new ChromeDriver();
	String URL="https://www.saucedemo.com/";
	
			
	
	@BeforeTest
	public void Setup() {
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Test() {
		
		
		List<WebElement> element= driver.findElements(By.className("btn_primary"));
		 for (int i=0; i<element.size(); i+=2) {
			 element.get(i).click();
		 }
		
	}
	
	@AfterTest
	public void AfterTest() {
		
	}
	
	
	
	

}
