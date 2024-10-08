package Tuto1.Tuto1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass{
	WebDriver driver;
	
    @Parameters("browserType")
	@BeforeTest
	public void browser(String browserType) {

		if(browserType.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}

	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}
