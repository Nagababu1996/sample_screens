package Tuto1.Tuto1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown extends baseclass {

	@Test
	public void dd() throws InterruptedException {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 700);");
		
		Thread.sleep(3000);
		
		Select list = new Select(driver.findElement(By.id("country")));
		list.selectByVisibleText("India");
		
		Thread.sleep(3000);
		
		Select glist = new Select(driver.findElement(By.id("colors")));
		glist.selectByVisibleText("Green");
		
		Thread.sleep(3000);
		
	}
}
