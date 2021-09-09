package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
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
			{
				Logs.startLog("Initialzing Driver");
				Logs.addToReport("Execution starts now. Driver Initialization for ", info);
				System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
				DesiredCapabilities capabilities = DesiredCapabilities.firefox();
				capabilities.setCapability("marionette", true);
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				Logs.addToReport("Browser Initialization success", pass);
			}
		}
		Logs.stopLog();
		return driver;
	}
}
