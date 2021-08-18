package utility;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportLogger {
	
	ExtentReports report;
	ExtentTest logger;
	
	
	public ReportLogger()
	{
		report=new ExtentReports("./Reports/Report.html");

	}
	public void startReport(String tcname)
	{
		//report=new ExtentReports("./Reports/Report.html");
		logger=report.startTest(tcname);
	}
	public void addToReport(String message, String type)
	{
		if(type.equals("INFO"))
		{
			System.out.println(message);
			logger.log(LogStatus.INFO, message);
		}
		else if(type.equals("PASS"))
		{
			System.out.println(message);
			logger.log(LogStatus.PASS, message);
		}
		else if(type.equals("FAIL"))
		{
			System.out.println(message);
			logger.log(LogStatus.FAIL, message);
		}
	}
	
	public void addScreenShot(String input, String message, String type)
	{
		logger.addScreenCapture(input);
		if(type.equals("FAIL"))
		{
			System.out.println(message);
			logger.log(LogStatus.FAIL, input, message);
		}
		
	}
	
	public void closeLogs()
	{
		report.endTest(logger);
	}
	
	public void flushLogs()
	{
		report.flush();
	}

}

