package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
static ExtentReports report;
	public static ExtentReports summary()
	{
		String path=System.getProperty("user.dir")+"//work//index.html";
		ExtentSparkReporter rep= new ExtentSparkReporter(path);
		rep.config().setReportName("work");
		rep.config().setDocumentTitle("firstproject");
	
	 report=new ExtentReports();
	report.attachReporter(rep);
	report.setSystemInfo("tester", "param");
	return report;
}
}