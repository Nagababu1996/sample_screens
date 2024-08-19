package Tuto1.Tuto1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fieldsvalidation extends baseclass {

	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		FieldsUtilities obj = new FieldsUtilities();
		
		driver.findElement(By.id(obj.name)).sendKeys("abcdefg");
		driver.findElement(By.id(obj.email)).sendKeys("xyz@gmail.com");
		driver.findElement(By.id(obj.phone)).sendKeys("8765876757856");
		driver.findElement(By.id(obj.address)).sendKeys("Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
