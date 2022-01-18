package pageobject;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.BaseTest;
import com.mindtree.reusable.WebDriverHelper;

import uistore.CorporateCarRentalPageUI;
import utility.Logs;

public class CorporateCarRentalPage  extends BaseTest {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public CorporateCarRentalPage(){
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void ClickOnCorporateCarRental() {
		log = loggerUtil.createLog("CorporateCarRental.java");
		try {
			helper.actionClick(CorporateCarRentalPageUI.corporate);
			log.debug("Clicked on CorporateCarRental under service section");
			test.log(Status.PASS, "Clicked on CorporateCarRental under service section");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot Click on CorporateCarRental under service section");
			test.log(Status.FAIL, "Cannot Click on CorporateCarRental under service section");

		}
	}

	public void Switchtab(int i) {
		try {
			helper.switchHandles(i);
			log.debug("Switched to new Tab");
			test.log(Status.PASS, "Switched to new Tab");
		} catch (Exception e) {
			log.debug("Cannot Switched to new Tab");
			test.log(Status.FAIL, "Cannot Switched to new Tab");

		}
	}

	public void EnterName(String name) {
		try {
			helper.sendText(CorporateCarRentalPageUI.name, name);
			log.debug("Name Entered");
			test.log(Status.PASS, "Name Entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot Enter Name");
			test.log(Status.FAIL, "Cannot Enter Name");

		}
	}

	public void EnterCompany(String company) {
		try {
			helper.sendText(CorporateCarRentalPageUI.company, company);
			log.debug("Company name Entered");
			test.log(Status.PASS, "Company name Entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Company name");
			test.log(Status.FAIL, "Cannot fill Company name");

		}
	}

	public void EnterEmail(String email) {
		try {
			helper.sendText(CorporateCarRentalPageUI.email, email);
			log.debug("Email  Entered");
			test.log(Status.PASS, "Email  Entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Email");
			test.log(Status.FAIL, "Cannot fill Email");

		}
	}

	public void EnterPhoneNo(String Phone) {
		try {
			helper.sendText(CorporateCarRentalPageUI.phoneno, Phone);
			log.debug("Phone no Entered");
			test.log(Status.PASS, "Phone no Entered");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot fill Phone no");
			test.log(Status.FAIL, "Cannot fill Phone no");

		}
	}

	public void SelectRentalReq(String req) {
		try {
			helper.selectByValue(CorporateCarRentalPageUI.req,
					req);
			log.debug("Rental Requirment Selected");
			test.log(Status.PASS, "Rental Requirment Selected");
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("Cannot select Rental Requirment ");
			test.log(Status.FAIL, "Cannot select Rental Requirment ");

		}
	}

	public void ClickSubmit() {
		try {
			helper.actionClick(CorporateCarRentalPageUI.submit);
			log.debug("Submit button Clicked");
			test.log(Status.PASS, "Submit button Clicked");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot Click Submit button ");
			test.log(Status.FAIL, "Cannot Click Submit button ");

		}
	}

	public void ValidateMSG() {
		try {
			helper.applicationWait(5000);
			log.info(helper.getText(CorporateCarRentalPageUI.msg));
			log.debug("MSG validated");
			test.log(Status.PASS, "MSG validated");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
			log.debug("Cannot validate MSG");
			test.log(Status.FAIL, "Cannot validate MSG");

		}
	}
}
