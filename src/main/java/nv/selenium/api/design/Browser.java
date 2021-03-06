package nv.selenium.api.design;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface Browser {
	
	
	public RemoteWebDriver startApp(String browser, String url);
	public WebElement locateElement(String locatorType, String value);	
	

}
