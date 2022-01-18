package utility;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReporterNG {

	static ExtentReports extent;


	public static ExtentReports extentReportGenerator() 
	{
		String reportPath=System.getProperty("user.dir")+"\\Extentreport\\index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		spark.config().setReportName("Automation Results");
		spark.config().setDocumentTitle("Test Results");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;
	}
}