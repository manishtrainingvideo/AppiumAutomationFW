package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MoreModule {
	
	public MoreModule(AndroidDriver<AndroidElement> driver){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="nz.co.celo.app.staging:id/bb_profile")
	public WebElement moreModule;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Log out and Forget me']")
	public WebElement logOutButton;

}
