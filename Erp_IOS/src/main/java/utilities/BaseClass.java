package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
public static AppiumDriver driver;
    
    public static String R;
	public static void sendkeys(By locator,String s) throws Exception
	{
		try {
			WebElement element=driver.findElement(locator);
			element.sendKeys(s);
		} catch (Exception e) {
			throw new Exception("unable to send the data"+locator);

		}
	}
	public static void click(By locator) throws Exception
	{
		try {
			WebElement element=driver.findElement(locator);
			element.click();

		} catch (Exception e) {
			throw new Exception("unable to click the element");

		}
	}
	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);

	}
	public static String captureScreenshot() throws IOException {

		File srcFiler = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] encoded;
		try {
			encoded = Base64.encodeBase64(FileUtils.readFileToByteArray(srcFiler));
			String shot = new String(encoded, StandardCharsets.US_ASCII);
			return shot;

		} catch (IOException e) {
			e.printStackTrace();

		}
		return null ;

	}
	public static boolean IsElementDisplayed(By Locator) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 120);
		WebElement ElementDisplay = wait.until(ExpectedConditions.elementToBeClickable(Locator));
		return ElementDisplay.isDisplayed();
		}

}
