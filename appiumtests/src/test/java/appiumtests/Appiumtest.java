package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.*;
import io.appium.java_client.AppiumDriver;

public class Appiumtest  {
	
	static AppiumDriver driver;
	
	public static void main(String[] args) {
		
		try {
			AutomateApp();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	public static void AutomateApp() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Redmi Note 12");
		cap.setCapability("udid","74347556");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","14 UKQ1.230917.001");
		cap.setCapability("appPackage","com.nesttek360.TOTUser");
		cap.setCapability("appActivity","com.nesttek360.TOTUser.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url,cap);
		System.out.println("Application Has Been Statrted Succcessfully....");
	}

}
