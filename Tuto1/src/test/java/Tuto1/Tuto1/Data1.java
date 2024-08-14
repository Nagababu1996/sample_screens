package Tuto1.Tuto1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Data1 {
WebDriver driver;
	@BeforeTest
	public void start() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");


	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void case1() {
		
		Utilities obj = new Utilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(obj.t1)).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter keyword / designation / companies\"]")).sendKeys("QA Testing");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//b[text()=\"QA testing\"]")).click();
		driver.findElement(By.id("experienceDD")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@value=\"a0\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Enter location\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//b[text()=\"Bengalur\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Search\"]")).click();
		

	}
	
	@AfterTest
	public void teardown() {
		
		driver.close();
		

	}
}
