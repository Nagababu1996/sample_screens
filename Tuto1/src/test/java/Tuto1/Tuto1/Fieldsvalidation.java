package Tuto1.Tuto1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fieldsvalidation extends baseclass {

	@Test
	public void test1() {
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		FieldsUtilities obj = new FieldsUtilities();
		
		driver.findElement(By.id(obj.name)).sendKeys("abcdefg");
		driver.findElement(By.id(obj.email)).sendKeys("xyz@gmail.com");
	}
}
