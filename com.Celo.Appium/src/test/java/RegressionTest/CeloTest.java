package RegressionTest;

import java.io.File;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.Camera;
import pageObjects.Library;
import pageObjects.MoreModule;
import utility.CaptureScreenshot;
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
	
	//@Test
	public void libratyModule() throws MalformedURLException, InterruptedException{
		
		Library lb= new Library(driver);
		CaptureScreenshot cs= new CaptureScreenshot(driver);
		
		Thread.sleep(3000);		
		lb.libraryModuleBtn.click();
		Thread.sleep(5000);		
		lb.imageClick.get(0).click();		
		lb.shareBtn.click();
		lb.clickOUserName.click();
		lb.sendPhotoBtn.click();
		Thread.sleep(5000);
		lb.timeView.click();
		Thread.sleep(2000);
		cs.takeScreenshot();
		driver.navigate().back();
		driver.navigate().back();
}	
	//@Test
	public void capturePhotoUsingCamera() throws InterruptedException{
		
		Camera ca= new Camera(driver);
		
		ca.cameraModuleBtn.click();
		ca.cameraAllowPopup.click();
		ca.captureBtn.click();
		ca.cameraSaveBtn.click();
		Thread.sleep(10000);
		ca.imageClick.get(0).click();
		ca.cameraShareBtn.click();
		ca.selectUser.click();
		ca.sendPhotoBtn.click();
		
	}
}
