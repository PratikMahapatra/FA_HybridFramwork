package uistore;

import org.openqa.selenium.By;

public class HomepageUI {
	
	public static By signin = By.xpath(".//*[@class='bg-signin m-auto']");
	public static By register = By.xpath(".//*[@class='theme-button-register']");
	public static By username =By.xpath(".//*[@formcontrolname='userName']");
	public static By phone = By.xpath(".//*[@formcontrolname='userPhone']");
	public static By email = By.xpath(".//*[@formcontrolname='userEmail']");
	public static By pass = By.xpath(".//*[@formcontrolname='userPassword']");
	public static By repass = By.xpath(".//*[@formcontrolname='retypePassword']");
	public static By submit = By.xpath(".//*[@class='hori-vertical-center']");		
}