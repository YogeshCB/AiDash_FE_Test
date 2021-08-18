package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import commonMethods.CommMeths;
import commonMethods.Logs;

public class DriverInitalization 
{
	WebDriver driver;
	CommMeths cm;
	String info="INFO";
	String pass="PASS";
	String fail="FAIL";
	SoftAssert assertion = new SoftAssert();
	
	public DriverInitalization()
	{
		cm = new CommMeths();
	}
	
	public WebDriver initalizeDriver(WebDriver driver, String browser)
	{
		this.driver=driver;
		if(browser.equalsIgnoreCase("firefox"))
		{
			Logs.startLog("Initialzing Driver");
			Logs.addToReport("Execution starts now. Driver Initialization for ", info);
			System.setProperty("webdriver.gecko.driver", "/Users/yogeshbhatt/Downloads/AIDASH-FE_TESTS/FE-TEST-SUITE/exes/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Logs.addToReport("Browser Initialization success", pass);
		}
		Logs.stopLog();
		return driver;
	}
}
