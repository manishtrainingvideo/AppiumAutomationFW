package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CaptureScreenshot {
	
	AndroidDriver<AndroidElement> driver;
	
	public CaptureScreenshot(AndroidDriver<AndroidElement> driver){
		
		this.driver= driver;
	}
	
	public void takeScreenshot() {
		
		File f= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try{
			FileUtils.copyFile(f, new File("C:\\Users\\manish8.kumar\\git\\AppiumAutomationFW\\com.Celo.Appium\\abc.png"));
		}catch(Exception ex){
		
		System.out.println("Exception " + ex.toString());
		
	}
	}
	
	

}
