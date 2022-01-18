package uistore;

import org.openqa.selenium.By;

public class OutstationPageUI {
	
	public static By src = By.xpath(".//*[@id='fromCityList']");
	public static By srcclick =By.xpath(".//*[@class='ngb-highlight ng-star-inserted']");
	public static By dest = By.xpath(".//*[@class='form-control ng-untouched ng-pristine ng-invalid']");
	public static By destclick = By.id("ngb-typeahead-1-0");
	public static By datepicker = By.xpath("//*[@class=\"ng-tns-c75-1 form-control p-inputtext p-component ng-star-inserted\"]");
	public static By mon = By.xpath(".//*[@class='p-datepicker-title ng-tns-c75-1']");
	public static By nxt = By.xpath("//*[@class=\"p-datepicker-next-icon pi pi-chevron-right ng-tns-c75-12");
	public static By date = By.xpath(".//tbody[@class='ng-tns-c75-1']/tr/td");
	public static By pickup = By.xpath("//*[@id=\"pickUpTime\"]");
	public static By searchcar = By.xpath(".//*[@class='book-button btn']");
	public static By firstcar = By.xpath(".//*[@class='selectFareDetailsBlock']");
	public static By price = By.xpath(".//*[@class='discountPrice']");
}
