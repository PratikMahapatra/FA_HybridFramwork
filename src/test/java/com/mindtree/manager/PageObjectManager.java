package com.mindtree.manager;

import pageobject.Homepage;
import pageobject.AboutUsPage;
import pageobject.AirportPage;
import pageobject.ContactUsPage;
import pageobject.CorporateCarRentalPage;
import pageobject.LocalPage;
import pageobject.OneWayPage;
import pageobject.OutstationPage;


public class PageObjectManager extends WebDriverManager{
	private Homepage Homepage;
	private AboutUsPage AboutUsPage;
	private AirportPage AirportPage;
	private ContactUsPage ContactUsPage;
	private CorporateCarRentalPage CorporateCarRentalPage;
	private LocalPage LocalPage;
	private OneWayPage OneWayPage;
	private OutstationPage OutstationPage;

	public Homepage getHomePage() {
		return(Homepage==null) ? Homepage = new Homepage():Homepage;
	}
	public AboutUsPage getAboutUsPage() {
		return(AboutUsPage==null) ? AboutUsPage = new AboutUsPage():AboutUsPage;
	}
	public AirportPage getAirportPage() {
		return(AirportPage==null) ? AirportPage = new AirportPage():AirportPage;
	}
	public ContactUsPage getContactUsPage() {
		return(ContactUsPage==null) ? ContactUsPage = new ContactUsPage():ContactUsPage;
	}
	public CorporateCarRentalPage getCorporateCarRentalPage() {
		return(CorporateCarRentalPage==null) ? CorporateCarRentalPage = new CorporateCarRentalPage():CorporateCarRentalPage;
	}
	public LocalPage getLocalPage() {
		return(LocalPage==null) ? LocalPage = new LocalPage():LocalPage;
	}
	public OneWayPage getOneWayPage() {
		return(OneWayPage==null) ? OneWayPage = new OneWayPage():OneWayPage;
	}
	public OutstationPage getOutstationPage() {
		return(OutstationPage==null) ? OutstationPage = new OutstationPage():OutstationPage;
	}
}
