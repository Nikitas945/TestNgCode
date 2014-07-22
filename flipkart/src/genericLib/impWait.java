package genericLib;

import java.util.concurrent.TimeUnit;

public class impWait extends callDriver {
	
	public void implicitWait(int timeInSec)
	{
		d.manage().timeouts().implicitlyWait(timeInSec,TimeUnit.SECONDS);
		
	}

}
