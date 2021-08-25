package test3;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App3 {
	
	WebDriver driver;
	@Test

	public void test3() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Newselenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://intellipaat.com"); 
		driver.manage().window().maximize();
		
		driver.findElement(By.className("main-search-input")).sendKeys("DevOps");
		driver.findElement(By.id("home-search-btn")).click(); 
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		String firstData = driver.findElement(By.className("list-style-course-name")).getText(); 
		String CheckData = "DevOps Certification Training";
		if(firstData.equals(CheckData)) { 
			driver.findElement(By.className("list-style-course-name")).click(); 
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			}
		else {
			System.out.println("Course not found");
			}
		
		
		String actualData = driver.findElement(By.className("mt-0")).getText(); 
		String expectedData = "DevOps Certification Training";
		if(actualData.equals(expectedData)) { 
			System.out.println("Found String!");
			String dateView = driver.findElement(By.className("master-time-table-date")).getText(); 
			String timeView = driver.findElement(By.className("master-time-table-weekdays-wrap")).getText();
			String exacttimeView = driver.findElement(By.className("master-time-table-time-wrap")).getText();
			System.out.println("Next Batch is on: \n"+ dateView + "\n"+ timeView + "\n"+ exacttimeView); 
			System.out.println("Test Successful");
			driver.close();
			}
		else {
			System.out.println("Oops!! String Not Found.");
			}

	}

}
