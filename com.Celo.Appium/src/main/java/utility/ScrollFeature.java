package utility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollFeature {
	
	AndroidDriver<AndroidElement> driver;
	
	public ScrollFeature(AndroidDriver<AndroidElement> driver){
		
		this.driver= driver;
	}
	
	public void scroll(String text) {
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\""+text+"\"))").click();
		
	}
	
	

}
