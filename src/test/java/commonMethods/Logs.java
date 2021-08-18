package commonMethods;

import utility.ReportLogger;

public class Logs {
	static ReportLogger log = new ReportLogger();
	

	public static void startLog(String tcname)
	{
		log.startReport(tcname);
	}
	
	public static void addToReport(String message, String type)
	{
		log.addToReport(message, type);
	}
	
	public static void stopLog()
	{
		log.closeLogs();
	}

	public static void flushLog()
	{
		log.flushLogs();
	}
	public static void addScreenshot(String input, String message, String type)
	{
		log.addScreenShot(input, message, type);
	}
	
}
