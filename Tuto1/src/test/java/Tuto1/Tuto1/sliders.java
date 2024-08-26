package Tuto1.Tuto1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sliders extends baseclass {

	@Test
	public void slide() throws InterruptedException {
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 500);");
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.id("slider"));
		
		act.dragAndDropBy(ele, 50, 0).perform();
		
		Thread.sleep(3000);
	}
}
