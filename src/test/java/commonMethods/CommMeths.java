package commonMethods;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.CommonTestCases;

public class CommMeths
{
	ReadInput userinput;
	CommonTestCases ct;
	static public HashMap<String, String> hmapjourneydetails = new HashMap<String, String>();


	public CommMeths()
	{
		try
		{
			userinput= new ReadInput();
		}
		catch(Exception e)
		{
			System.out.println("Exception is: "+e);
		}
	}
	
	public String getInput(String input)
	{
		String value = userinput.getValue(input);
		return value;
	}
	
	public void titleExplicitWait(WebDriver driver, String text, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleContains(text));
	}
	
	public void elementExplicitWait(WebDriver driver, WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void elementvisibilityExplicitWait(WebDriver driver, WebElement element, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}




}
