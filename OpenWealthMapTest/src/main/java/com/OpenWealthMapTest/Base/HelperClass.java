/**
 * 
 */
package com.OpenWealthMapTest.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.OpenWealthMapTest.utlity.TestUtill;


/**
 * @author rush2Bharat
 *
 */
public class HelperClass {

	// Define a Variable
	public static WebDriver driver;
	public static Properties prop;
	// Step 1: Create one Cunstructor
	public HelperClass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("E:\\Excersise\\OpenWealthMapTest\\src\\main\\"
					+ "java\\com\\OpenWealthMapTest\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Initialization() {
		prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "E:\\Excersise\\OpenWealthMapTest"
				+ "\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.page_load_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICITY_WAIT,TimeUnit.SECONDS);
		//Open The URL
		driver.get(prop.getProperty("url"));

	}

}

