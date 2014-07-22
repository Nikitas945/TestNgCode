package testNG;

import java.io.IOException;
import java.util.List;

import genericLib.callDriver;
import genericLib.impWait;
import genericLib.screenShotCode;
import genericLib.scrollDown;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.appliancesPF;
import pageFactory.searchPF;

public class DetailsAppliances extends callDriver {
	
	private appliancesPF app=PageFactory.initElements(d, appliancesPF.class);
	private searchPF searchIt=PageFactory.initElements(d, searchPF.class);
	
	private static final Logger LOGGER = Logger.getLogger(DetailsAppliances.class);
	
	private impWait imp = new impWait();
	
	private screenShotCode scShot = new screenShotCode();
	private scrollDown scrollLib = new scrollDown();
	
	@BeforeTest
	public void login()  {
		d.get("http://www.flipkart.com/");
		 
		//imp.implicitWait(10);
		 
		 
		 BasicConfigurator.configure();
		LOGGER.info("done sucessfully");
		
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		LOGGER.info("done sucessfully");
		System.out.println("end");
	}
	
	
  @Test(priority=1)
  public void appliancesClick() throws IOException {

	 //enter "appliances"  and click enter
//	 searchIt.getSearchBar().sendKeys("appliances");
    
//	 try {
//		  searchIt.getSearchButton().click();
//	 } catch(Exception e) {
//		 scShot.takeScreenshot("Appliances.png");
//		 System.out.println("screen Shot done");
//	 }
//	
//	 imp.implicitWait(10);
	
  }
  
//	 @Test
//	  public void selectAppliance() {
//
//	      String  xpathOfAllAppliances =app.getAllAppliancesLink();
//	      
//	  d.findElement(By.xpath("//div[@id='browse-results-area']/div[4]/div[2]/div/div/div/div[2]/a[contains(text(),'Books')]")).click();
//	      System.out.println("clicked");
//	      
//	      System.out.println(listOfAllAppliances.getSize());
//	      for(int i=0;i<listOfAllAppliances.getSize();i++){
//	    	
//	    	  System.out.println("for Loop1");
//	    	   System.out.println(listOfAllAppliances.get(i).getText());
//	      }
//	   
//	      
//	      for(int i=0;i<listOfAllAppliances.getSize();i++){
//	    	  System.out.println("foor loop 2");
//	    	  if("Books".equals(listOfAllAppliances.get(i).getText())){
//	    		  
//	    		  System.out.println("============================");
//	    	  }
//	    	  
//	      }
	      
//}
	  
}
