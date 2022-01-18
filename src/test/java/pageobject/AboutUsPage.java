package pageobject;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.BaseTest;
import com.mindtree.reusable.WebDriverHelper;

import uistore.AboutUsPageUI;
import utility.Logs;

public class AboutUsPage extends BaseTest {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public AboutUsPage() {
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}

	public void ClickOnAbout() {
		log = loggerUtil.createLog("AboutUsPage.java");
		try {
			helper.clickButton(AboutUsPageUI.aboutus);
			log.debug("About Us Clicked");
			test.log(Status.PASS, "About Us Clicked");
		} catch (WebDriverHelperException e) {
			log.debug("Cannot Click About Us");
			test.log(Status.FAIL, "Cannot Click About Us ");
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

	public void Validate(String ExpectedCeoName) {
		try {
			String ActualCeoName = helper.getText(AboutUsPageUI.ceo);
			if (ActualCeoName.contains(ExpectedCeoName)) {
				log.debug("CeoName  Validated : " + ActualCeoName);
			}
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
}
