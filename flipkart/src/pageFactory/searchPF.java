package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class searchPF {
	
	@FindBy(xpath="//input[@id='fk-top-search-box']")
	private WebElement searchBar;

	public WebElement getSearchBar() {
		return searchBar;
	}
	
	 @FindBy(xpath="//input[@value='Search']")
	 private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}
	 
	 

}
