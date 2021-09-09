

package TestExecutionSuite;
import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import TestCases.CommonTestCases;




public class BasicFunctionalExecutionSuite {

	CommonTestCases ctcs;
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Execution Suite starts");
	}




	@BeforeTest
	public void setup() throws IOException
	{
		System.out.println(" Execution Suite Test starts");
	}


	@Test (priority = 0)
	@Parameters("browser")
	public void driverInitalization(String browser) 
	{
		ctcs = new CommonTestCases();
		ctcs.initalizeDriver(browser);
	}


	@Test (priority = 1)
	public void openUrlForAidashLoginPage()
	{
		ctcs.OpenAidash();

	}

	@Test (priority = 2)
	public void LoginToAidash()
	{
		ctcs.Ai_dash_login_screen();


	}

	@Test (priority = 3)
	public void Navigation() throws InterruptedException {
		ctcs.Ai_Dash_Home_Page();
		Thread.sleep(100);

	}

	@Test (priority = 4)
	public void CreateTree() throws InterruptedException {
		ctcs.Ai_Dash_create_Tree_page();
		Thread.sleep(100);



	}

	@Test (priority = 5)
	public void CreateTreeScreen2() throws InterruptedException {
		ctcs.Ai_dash_create_tree_screen2();
		Thread.sleep(100);

	}



	@AfterMethod
	public void afterEveryMethod(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			ctcs.takeScreenShotOnFailure(result.getTestName());
		}
	}
	
	@AfterTest
	public void teardown()
	{
		ctcs.flushLogs();
	}


}
