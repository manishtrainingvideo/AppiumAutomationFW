package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Library {
	
public Library(AndroidDriver<AndroidElement> driver){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id="nz.co.celo.app.staging:id/bb_library")
	public WebElement libraryModuleBtn;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/photoView")
	public List<WebElement> imageClick;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/action_share")
	public WebElement shareBtn;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Aravind Staging']")
	public WebElement clickOUserName;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/doneButton")
	public WebElement sendPhotoBtn;
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/timeView")
	public WebElement timeView;
	

	

}
