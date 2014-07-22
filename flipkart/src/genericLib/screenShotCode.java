package genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenShotCode {

	
	public void takeScreenshot(String pathOfScreenShot) throws IOException
	{
		EventFiringWebDriver ef=new EventFiringWebDriver(callDriver.d);
		File src=ef.getScreenshotAs(OutputType.FILE);
	      
//      File dest=new File("C:\\Users\\Chonam\\Desktop\\pic1.png");
      File dest=new File("C:\\Users\\Chonam\\workspace2\\flipkart\\screenShots\\"+pathOfScreenShot);
      
      FileUtils.copyFile(src, dest);
      
	}
}
