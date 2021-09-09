

package TestExecutionSuite;
import java.io.IOException;

import com.relevantcodes.extentreports.ExtentReports;
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
		// initialize the HtmlReporter
//		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
//
//		//initialize ExtentReports and attach the HtmlReporter
//		extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
//
//		//To add system or environment info by using the setSystemInfo method.
//		extent.setSystemInfo("OS", OS);
//		extent.setSystemInfo("Browser", browser);
//
//		//configuration items to change the look and feel
//		//add content, manage tests etc
//		htmlReporter.config().setChartVisibilityOnOpen(true);
//		htmlReporter.config().setDocumentTitle("Extent Report Demo");
//		htmlReporter.config().setReportName("Test Report");
//		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//		htmlReporter.config().setTheme(Theme.STANDARD);
//		htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
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
	public void LoginToAidash() throws InterruptedException {
		ctcs.Ai_dash_login_screen();
		Thread.sleep(10000);


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
