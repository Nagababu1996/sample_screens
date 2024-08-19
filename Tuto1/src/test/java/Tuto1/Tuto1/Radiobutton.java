package Tuto1.Tuto1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Radiobutton extends baseclass {

	@Test
	public void radio() throws InterruptedException {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 300);");
		
		WebElement male = driver.findElement(By.id("male"));
		male.click();
		
		Thread.sleep(3000); 

		WebElement female = driver.findElement(By.id("female"));
		female.click();

		Thread.sleep(3000); 
	}
}
