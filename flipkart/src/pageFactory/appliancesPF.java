package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class appliancesPF {

	@FindBy(xpath="//span[@title='appliances']")
	private WebElement textAppliance;

	public WebElement getTextAppliance() {
		return textAppliance;
	}
	
	@FindBy(xpath="//div[@id='searchCount']/span[2]")
	private WebElement noOfAppliances;

	public WebElement getNoOfAppliances() {
		return noOfAppliances;
	}
	
	
	
	@FindBy(xpath="//select[@id='sort-dropdown']")
    private WebElement sortByDropDown;
	
	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}

	
	
	@FindBy(xpath="//img[@src='http://img5a.flixcart.com/image/electric-cooker/j/u/6/philips-hd9220-20-2-2-l-air-fryer-hd9220-20-125x125-imadrmhdkn4gvanr.jpeg']")
	private String philipsAirFrier;

	public String getPhilipsAirFrier() {
		return philipsAirFrier;
	}
	
	
	@FindBy(xpath="//div[@id='products']/div/div/div/div[2]/div[4]/span")
	private String totaoCountOfAppliances;

	public String getTotaoCountOfAppliances() {
		return totaoCountOfAppliances;
	}
	
	
	@FindBy(xpath="//div[@id='browse-results-area']/div[4]/div[2]/div/div/div/div[2]/a")
	private String getAllAppliancesLink;

	public String getAllAppliancesLink() {
		return getAllAppliancesLink;
	}
	
	
	
	
}
