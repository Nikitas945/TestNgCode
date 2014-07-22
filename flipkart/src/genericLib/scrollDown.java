package genericLib;

import org.openqa.selenium.JavascriptExecutor;

public class scrollDown extends callDriver {
	
	public void scrollIt()
	{
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("scroll(0, 250);");
		
//		js.executeScript("window.scrollBy(200,0)"," ");
	}

}
