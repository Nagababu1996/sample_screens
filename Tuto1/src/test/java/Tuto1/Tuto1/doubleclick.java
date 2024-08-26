package Tuto1.Tuto1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class doubleclick extends baseclass{

	@Test
	public void dc() throws InterruptedException {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 300);");
		
		Actions act =new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
		
		act.doubleClick(ele).perform();
		
		Thread.sleep(3000);
	}
}
