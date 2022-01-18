package pageobject;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.BaseTest;
import com.mindtree.reusable.WebDriverHelper;

import uistore.OutstationPageUI;
import utility.Logs;

public class OutstationPage extends BaseTest {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public OutstationPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void SelectSrc(String string) {
		try {
			log = loggerUtil.createLog("OutstationPage.java");
			helper.sendText(OutstationPageUI.src,string );
			helper.applicationWait(5000);
			helper.actionClick(OutstationPageUI.srcclick);
			log.debug("Source location filled");
			test.log(Status.PASS, "Source location filled");

		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Source location");
			test.log(Status.FAIL, "Cannot fill Source location");
		}
	}

	public void SelectDest(String string) {
		try {
			helper.sendText(OutstationPageUI.dest,
					string);
			helper.applicationWait(5000);
			helper.actionClick(OutstationPageUI.destclick);
			log.debug("Destination location filled");
			test.log(Status.PASS, "Destination location filled");

		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Destination location");
			test.log(Status.FAIL, "Cannot fill Destination location");
		}
	}

	public void SelectDate(String Month,String Date) {
		try {
			helper.actionClick(
					OutstationPageUI.datepicker);
			helper.applicationWait(5000);
			helper.Datepicker(OutstationPageUI.mon, Month,
					OutstationPageUI.nxt,
					OutstationPageUI.date, Date);
			log.debug("Date  selected");
			test.log(Status.PASS, "Date  selected");

		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot select Date ");
			test.log(Status.FAIL, "Cannot select Date ");
		}
	}

	public void SelectPickuptime(String string) {
		try {
			helper.selectByText(OutstationPageUI.pickup,string );
			log.debug("Pickuptime  selected");
			test.log(Status.PASS, "Pickuptime  selected");

		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot select Pickuptime ");
			test.log(Status.FAIL, "Cannot select Pickuptime ");
		}
	}

	public void ClickOnSearchCar() {
		try {
			helper.actionClick(OutstationPageUI.searchcar);
			log.debug("SearchCar Clicked");
			test.log(Status.PASS, "SearchCar Clicked");

		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Click SearchCar ");
			test.log(Status.FAIL, "Cannot Click SearchCar ");
		}
	}

	public void SelectFirstCar() {
		try {
			helper.applicationWait(5000);
			helper.actionClick(OutstationPageUI.firstcar);
			log.debug("First Car Selected in the result page");
			test.log(Status.PASS, "First Car Selected in the result page");

		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Select Car ");
			test.log(Status.FAIL, "Cannot Select Car ");
		}
	}

	public void ValidateCarDetails(String Expectedprice) {
		try {
			helper.applicationWait(5000);
			String Actualprice = helper.getText(OutstationPageUI.price);
			if (Actualprice.contains(Expectedprice)) {
				log.info("Price Validated : " + Actualprice);
				test.log(Status.PASS, "Price Validated");

			} else {
				log.info("Price Validation Failed : " + Actualprice);
				test.log(Status.FAIL, "Price Validation Failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot Validate Car Details");
			test.log(Status.FAIL, "Cannot Validate Car Details");
		}
	}
}
