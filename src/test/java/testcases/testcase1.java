package testcases;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class testcase1 {
	static String appUrl;
	static WebDriver driver;
	static String URL;
	 static String BROWSER;
	 static String foldername;
	public static void main(String[] args){
	
	}
@BeforeClass
public void initialize()
{
	// appUrl="http://ec2-52-52-49-127.us-west-1.compute.amazonaws.com:8080";
	  BROWSER=System.getProperty("browser");
	System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	appUrl=System.getProperty("url");
	foldername=System.getProperty("foldername");
	
}
@Test
public void method1() {
	try {
		System.out.println(BROWSER);
		System.out.println(foldername);
	driver.get(appUrl + "/cosho");
	String page1html = driver.getPageSource();
	String Page1 = "Cosho";
	Writer fpwriter = null;
	try {
		fpwriter = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(foldername + "\\" + Page1 + ".txt"), "utf-8"));
		fpwriter.write(page1html);
		fpwriter.close();
	} catch (IOException ex) {
	}
	}
	catch(WebDriverException ex) {
		System.out.println("Exception in Method1");
	}
}
@Test
public void method2() {
	try {
	driver.get(appUrl + "/cosho/giftcard.jsp");
	}
	catch(WebDriverException ex) {
		System.out.println("Exception in Method12");
	}
}
@Test
public void method3() {
	try {
	driver.get(appUrl + "/cosho/orderDetails");
	}
	catch(WebDriverException ex) {
		System.out.println("Exception in Method3");
	}
}
@Test
public void method4() {
	try {
	driver.get(appUrl + "/cosho/viewCart");
	}
	catch(WebDriverException ex) {
		System.out.println("Exception in Method4");
	}
}
@AfterClass
public void deinitialize()
{

	File original = new File(
		      "C:\\\\Accessibility\\\\uploads\\\\5c612ac82e75d723d49c146a_5c5d651c19fb951b98b71512\\\\sample_607eaf89fe19b50acc245c75\\\\607eaf89fe19b50acc245c75\\\\7\\color.json");
	File copied = new File(foldername + "\\color.json" );
		    try {
				FileUtils.copyFile(original,copied );
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
driver.quit();
}
//@BeforeClass
//public void testSetup()
//{
//	System.out.println("We are currently on the following URL");
//System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
//driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//driver.manage().window().maximize();
//
//}
//
//@Test
//public void openBrowser()
//{
//driver.get("https://www.browserstack.com/");
//driver.findElement(By.id("signupModalButton")).click();
//System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
//}
//
//
//
//@AfterClass
//public void afterClass()
//{
//driver.quit();
//}

}