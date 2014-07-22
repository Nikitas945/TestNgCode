package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class callDriver {

	public static WebDriver d=new FirefoxDriver();
	
	public static WebDriver getdriver()
	{
		return d;
		
	}
}
