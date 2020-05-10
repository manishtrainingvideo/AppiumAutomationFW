package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Camera {
	
public Camera(AndroidDriver<AndroidElement> driver){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="nz.co.celo.app.staging:id/bb_camera")
	public WebElement cameraModuleBtn; 
	
	@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
	public WebElement cameraAllowPopup;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/capture_button")
	public WebElement captureBtn;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/save_button")
	public WebElement cameraSaveBtn;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/photoView")
	public List<WebElement> imageClick;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/action_share")
	public WebElement cameraShareBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Aravind Staging']")
	public WebElement selectUser;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/doneButton")
	public WebElement sendPhotoBtn;


}
