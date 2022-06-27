package testngListenerPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Screenshots {

	@Listeners(CustomListeners1.class)
	public class ScreenShots extends Base1 {

		@BeforeMethod
		public void setUp() {
			initialization();

		}

		@AfterMethod
		public void tearDown() {
			driver.quit();

		}

		@Test
		public void takeScreenshotTest1() {

			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		}

		@Test
		public void takeScreenshotTest2() {

			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		}

		@Test
		public void takeScreenshotTest3() {

			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		}

		@Test
		public void takeScreenshotTest4() {

			Assert.assertEquals(false, true);
		}

	}

}
