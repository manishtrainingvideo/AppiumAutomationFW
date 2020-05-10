package RegressionTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.Library;
import pageObjects.MoreModule;
import utility.CeloBase;
import utility.ScrollFeature;

public class CeloTest extends CeloBase {
	
	//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	
	//@Test
	public void run() throws MalformedURLException, InterruptedException{
		
		//AndroidDriver<AndroidElement> driver = capabilities();
		
		MoreModule mm = new MoreModule(driver);
		ScrollFeature sf= new ScrollFeature(driver);
		
		mm.moreModule.click();
		
		sf.scroll("Logout");
				
		//mm.logOutButton.click();		
	}
	
	@Test
	public void libratyModule() throws MalformedURLException, InterruptedException{
		
		Library lb= new Library(driver);
		
		Thread.sleep(3000);		
		lb.libraryModuleBtn.click();
		Thread.sleep(5000);
		
		lb.imageClick.get(0).click();
		
		lb.shareBtn.click();
		
		lb.clickOUserName.click();

		lb.sendPhotoBtn.click();
		Thread.sleep(5000);
		lb.timeView.click();
		
		//driver.navigate().back();
		//driver.navigate().back();
		Thread.sleep(2000);
		
	}
	
	
	
	

}
