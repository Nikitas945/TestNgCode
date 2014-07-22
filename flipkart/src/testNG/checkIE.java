package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class checkIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sUrl = "http://www.google.com";
		System.setProperty("webdriver.ie.driver","C:\\Users\\Chonam\\Downloads\\IEDriverServer_x64_2.42.01\\IEDriverServer.exe");
		
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		 
		
		WebDriver WebDriverObj = new InternetExplorerDriver(ieCapabilities);
		WebDriverObj.get(sUrl); 

	}

}
