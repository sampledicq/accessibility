package testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static void main(String[] args){

		System.out.println("Hello World");
		method();
	}
public static void method() {
	System.out.println("We are currently on the following URL");
	
System.setProperty("webdriver.chrome.driver", "C:\\MyDrivers\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/");
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
}


}