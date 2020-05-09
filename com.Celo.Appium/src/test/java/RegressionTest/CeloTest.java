package RegressionTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.MoreModule;
import utility.CeloBase;
import utility.ScrollFeature;

public class CeloTest extends CeloBase {
	
	@Test
	public void run() throws MalformedURLException, InterruptedException{
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		MoreModule mm = new MoreModule(driver);
		ScrollFeature sf= new ScrollFeature(driver);
		
		mm.moreModule.click();
		
		sf.scroll("Logout");
				
		//mm.logOutButton.click();
	}
	
	

}
