package driver;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driverlaunch {
	public static IOSDriver<IOSElement> iosDriver;

	  static DesiredCapabilities dc = new DesiredCapabilities();
	  public static IOSDriver<IOSElement> setUp() throws Throwable {
	      
	       dc.setCapability("testName", "Erp portal");
	       dc.setCapability(MobileCapabilityType.UDID,"00008020-000661A22E43002E");
	       dc.setBrowserName(MobileBrowserType.SAFARI);
	       iosDriver  = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	      
	       return iosDriver;
	   }
}
