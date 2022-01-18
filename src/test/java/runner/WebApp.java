package runner;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.mindtree.manager.PageObjectManager;
import com.mindtree.reusable.BaseTest;

import pageobject.AboutUsPage;
import pageobject.AirportPage;
import pageobject.ContactUsPage;
import pageobject.CorporateCarRentalPage;
import pageobject.Homepage;
import pageobject.LocalPage;
import pageobject.OneWayPage;
import pageobject.OutstationPage;
import utility.ExcelSheetRead;
import utility.ExtentReporterNG;
import utility.Logs;


public class WebApp extends BaseTest {
	static PageObjectManager pageManager;
	static Homepage homepage;
	static ContactUsPage contactpage;
	static AboutUsPage aboutpage;
	static CorporateCarRentalPage corporatepage;
	static OneWayPage onewaypage;
	static AirportPage airportpage;
	static OutstationPage outstationpage;
	static LocalPage localpage;
	static Logs loggerUtil;
	static Logger log;
	static ExcelSheetRead ex;
	static ExtentReports extent = ExtentReporterNG.extentReportGenerator();
	static String screenshotPath = null;

	@BeforeMethod
	public void Before() throws IOException {
		startUp();
		ex = new ExcelSheetRead(); 
	}

	@Test(priority = 1)
	public static void HomePage() throws IOException, InterruptedException {
		try {
			test = extent.createTest("HomePage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			loggerUtil = new Logs();
			log = loggerUtil.createLog("HomePage");
			pageManager = new PageObjectManager();
			homepage = pageManager.getHomePage();
			String ExpectedTitle = ex.read("HomepageTitle");
			homepage.ValidateTitle(ExpectedTitle);
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("HomePage");
		} catch (Exception e) {
			screenshotPath = getscreenshotpath("HomePage");
			test.fail("HomePage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			test.log(Status.FAIL, "UnSuccessful");
		}
	}

	@Test(priority = 2)
	public static void SignUp() throws IOException, InterruptedException {
		try {
			test = extent.createTest("SignUp");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("SignUp");
			pageManager = new PageObjectManager();
			String Name = ex.read("Name");
			String Phone = ex.read("Phone");
			String Email = ex.read("Email");
			String Password = ex.read("Password");
			String RePassword = ex.read("RePassword");
			homepage.SignUp(Name, Phone, Email, Password, RePassword);
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("SignUp");
		} catch (Exception e) {
			screenshotPath = getscreenshotpath("SignUp");
			test.fail("SignUp test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
		}
	}

	@Test(priority = 3)
	public static void HomepageLogin() throws IOException, InterruptedException {
		try {
			test = extent.createTest("HomepageLogin");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("HomepageLogin");
			pageManager = new PageObjectManager();
			String Email = ex.read("Email");
			String Password = ex.read("Password");
			homepage.Login(Email, Password);
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("HomepageLogin");
			
		} catch (Exception e) {
		
		screenshotPath = getscreenshotpath("HomepageLogin");//df
			test.fail("HomepageLogin test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");//df
			
		}
	}

	@Test(priority = 4)
	public static void AboutPage() throws IOException, InterruptedException {
		try {
		     
		     test = extent.createTest("AboutPage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("AboutPage");
			pageManager = new PageObjectManager();
			aboutpage = pageManager.getAboutUsPage();
			aboutpage.ClickOnAbout();
			aboutpage.Switchtab(1);
			String Expected = ex.read("CEO");
			aboutpage.Validate(Expected);
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("AboutPage");
		} catch (Exception e) {
		
		screenshotPath = getscreenshotpath("AboutPage");
			test.fail("AboutPage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
			
		}
	}

	@Test(priority = 5)
	public static void ContactPage() throws IOException, InterruptedException {
		try {
			
			test = extent.createTest("ContactPage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("ContactPage");
			pageManager = new PageObjectManager();
			contactpage = pageManager.getContactUsPage();
			contactpage.ClickOnContactUs();
			contactpage.Switchtab(1);
			String Contact = ex.read("Contact");
			contactpage.Validate(Contact);
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("ContactPage");
			
		} catch (Exception e) {
		
		screenshotPath = getscreenshotpath("ContactPage");
			test.fail("ContactPage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
			
		}

	}

	@Test(priority = 6)
	public static void OnewayPage() throws IOException, InterruptedException {
		try {
			
				test = extent.createTest("OnewayPage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("OnewayPage");
			pageManager = new PageObjectManager();
			onewaypage = pageManager.getOneWayPage();
			onewaypage.ClickOnOneWay();
			onewaypage.Switchtab(1);
			onewaypage.SelectAgra();
			onewaypage.SelectPlace();
			onewaypage.Switchtab(2);
			String Expected = ex.read("OneWay");
			onewaypage.ValidatePage(Expected);
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("OnewayPage");
			
		} catch (Exception e) {
			screenshotPath = getscreenshotpath("OnewayPage");
			test.fail("OnewayPage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
		}
	}

	@Test(priority = 7)
	public static void LocalPage() throws IOException, InterruptedException {
		try {
			test = extent.createTest("LocalPage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("LocalPage");
			pageManager = new PageObjectManager();
			localpage = pageManager.getLocalPage();

			localpage.ClickOnLocal();
			localpage.Switchtab(1);

			String Source = ex.read("Source");
			String Month = ex.read("Month");
			String Date = ex.read("Date").replace(".0", "");
			String Time = ex.read("Time");
			String CarType = ex.read("CarType");

			localpage.SelectSrc(Source);
			localpage.SelectDate(Month, Date);
			localpage.SelectPickuptime(Time);
			localpage.ClickOnSearchCar();
			localpage.SelectFirstCar();
			localpage.ValidateCarDetails(CarType);
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("LocalPage");
			
		} catch (Exception e) {
		screenshotPath = getscreenshotpath("LocalPage");
			test.fail("LocalPage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
			
		}
	}

	@Test(priority = 8)
	public static void OutstationPage() throws IOException, InterruptedException {
		try {
			test = extent.createTest("OutstationPage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("OutstationPage");
			pageManager = new PageObjectManager();
			String Source = ex.read("Source");
			String Destination = ex.read("Destination");
			String Month = ex.read("Month");
			String Date = ex.read("Date").replace(".0", "");
			String Time = ex.read("Time");
			String Outprice = ex.read("Outprice");

			outstationpage = pageManager.getOutstationPage();
			outstationpage.SelectSrc(Source);
			outstationpage.SelectDest(Destination);
			outstationpage.SelectDate(Month, Date);
			outstationpage.SelectPickuptime(Time);
			outstationpage.ClickOnSearchCar();
			outstationpage.SelectFirstCar();
			outstationpage.ValidateCarDetails(Outprice.replace(".0", ""));
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("OutstationPage");
			
			} catch (Exception e) {
			screenshotPath = getscreenshotpath("OutstationPage");
			test.fail("OutstationPage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
			
		}

	}

	@Test(priority = 9)
	public static void AirportPage() throws IOException, InterruptedException {
		try {
			test = extent.createTest("AirportPage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("AirportPage");
			pageManager = new PageObjectManager();

			String Source = ex.read("Source");
			String AirportDest = ex.read("AirportDest");
			String Month = ex.read("Month");
			String Date = ex.read("Date").replace(".0", "");
			String Time = ex.read("Time");
			String AirPrice = ex.read("AirPrice");

			airportpage = pageManager.getAirportPage();
			airportpage.ClickOnAirport();
			airportpage.Switchtab(1);
			airportpage.SelectSrc(Source);
			airportpage.SelectTripType();
			airportpage.SelectDest(AirportDest);
			airportpage.SelectDate(Month, Date);
			airportpage.SelectPickuptime(Time);
			airportpage.ClickOnSearchCar();
			airportpage.SelectFirstCar();
			airportpage.ValidateCarDetails(AirPrice.replace(".0", ""));
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("AirportPage");
			
		} catch (Exception e) {
		screenshotPath = getscreenshotpath("AirportPage");
			test.fail("AirportPage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
		
		}

	}

	@Test(priority = 10)
	public static void CorporatePage() throws IOException, InterruptedException {
		try {
			test = extent.createTest("CorporatePage");
			test.log(Status.PASS, "TestCase Execution Started");
			loggerUtil = new Logs();
			log = loggerUtil.createLog("CorporatePage");
			pageManager = new PageObjectManager();

			String Name = ex.read("Name");
			String Phone = ex.read("Phone");
			String Email = ex.read("Email");
			String Company = ex.read("Company");
			String Req = ex.read("Req");

			corporatepage = pageManager.getCorporateCarRentalPage();
			corporatepage.ClickOnCorporateCarRental();
			corporatepage.Switchtab(1);
			corporatepage.EnterName(Name);
			corporatepage.EnterCompany(Company);
			corporatepage.EnterEmail(Email);
			corporatepage.EnterPhoneNo(Phone);
			corporatepage.SelectRentalReq(Req);
			corporatepage.ClickSubmit();
			corporatepage.ValidateMSG();
			test.log(Status.PASS, "Successful");
			screenshotPath = getscreenshotpath("CorporatePage");
		} catch (Exception e) {
			screenshotPath = getscreenshotpath("CorporatePage");
			test.fail("CorporatePage test failed",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());//df
			test.log(Status.FAIL, "UnSuccessful");
		}
	}

	@AfterMethod
	public void After() {
		tearDown();
	}
	@AfterSuite()
	public void flush() {
		extent.flush();
	}
	

}
