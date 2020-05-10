package utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class CeloBase {
	
public static AndroidDriver<AndroidElement> driver;

@BeforeTest
	
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException, InterruptedException{
		
		// Appium Config.
		
		File f= new File("src");
		File fs= new File(f,"Celo-Staging-495-(1.16.28-staging).apk");
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/all_apps_handle")).click();
		
		driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/search_box_input")).click();
		
		driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/search_box_input")).sendKeys("celo");
		
		driver.findElement(By.id("com.google.android.apps.nexuslauncher:id/icon")).click();
		
       driver.findElement(By.id("nz.co.celo.app.staging:id/email_edit_text")).sendKeys("aravind.madana+test@celohealth.com");
		
		driver.findElement(By.id("nz.co.celo.app.staging:id/password_edit_text")).sendKeys("Test@123");
		
		Thread.sleep(2000);
		driver.findElement(By.id("nz.co.celo.app.staging:id/sign_in_button")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("nz.co.celo.app.staging:id/eightButton")).click();
		driver.findElement(By.id("nz.co.celo.app.staging:id/eightButton")).click();
		driver.findElement(By.id("nz.co.celo.app.staging:id/eightButton")).click();
		driver.findElement(By.id("nz.co.celo.app.staging:id/fiveButton")).click();
		
		//Thread.sleep(3000);
		driver.findElement(By.id("nz.co.celo.app.staging:id/eightButton")).click();
		driver.findElement(By.id("nz.co.celo.app.staging:id/eightButton")).click();
		driver.findElement(By.id("nz.co.celo.app.staging:id/eightButton")).click();
		driver.findElement(By.id("nz.co.celo.app.staging:id/fiveButton")).click();
		Thread.sleep(2000);
	
		return driver;
			
	}

}
