package testngListenerPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base1 {
	
public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();

		
		driver.get("https://opensource-demo.orangehrmlive.com/");

	
	}
	
	public void passed(String testMethodName1) {
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile1, new File("C:\\Users\\patel\\eclipse-workspace\\ScreenShot\\ScreenShortsFolder\\"+testMethodName1+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void failed(String testMethodName){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\patel\\eclipse-workspace\\ScreenShot\\ScreenShortsFolder\\"+testMethodName+"_"+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
