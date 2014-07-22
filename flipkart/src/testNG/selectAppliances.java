package testNG;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import genericLib.callDriver;
import genericLib.impWait;
import genericLib.screenShotCode;
import genericLib.scrollDown;

import org.apache.bcel.generic.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.appliancesPF;
import pageFactory.searchPF;

public class selectAppliances extends callDriver {
	

	searchPF searchIt=PageFactory.initElements(d, searchPF.class);
	appliancesPF appPF=PageFactory.initElements(d,appliancesPF.class);
	screenShotCode scShot= new screenShotCode();
	scrollDown scrollLib=new scrollDown();
	
	impWait imp=new impWait();

	
	@BeforeTest
	public void login(){
		d.get("http://www.flipkart.com/");
		 
		 imp.implicitWait(10);
		
	}
  @Test(priority=1)
  public void appliancesClick() throws IOException {

	 //enter "appliances"  and click enter
	 searchIt.getSearchBar().sendKeys("appliances");
    
	 try{
		  searchIt.getSearchButton().click();
	 }catch(Exception e)
	 {
		 scShot.takeScreenshot("Appliances.png");
		 System.out.println("screen Shot done");
	 }
	
      
      imp.implicitWait(10);
	
  }
  
  @Test(priority=2)
  public void nameAppliances(){
	  
//	  String xpatOfNameOApp=appPF.getTotaoCountOfAppliances();
	  
	  List<WebElement> nameOfAppliancesAre=d.findElements(By.xpath("//div[@id='products']/div/div/div/div[2]/div[4]/span"));
	  
	  scrollLib.scrollIt();scrollLib.scrollIt();
	  
	  System.out.println(nameOfAppliancesAre.size());
	  for(int i=0;i<nameOfAppliancesAre.size();i++)
	  {
		  System.out.println(nameOfAppliancesAre.get(i).getText());
	  }
	  
  }
  

}