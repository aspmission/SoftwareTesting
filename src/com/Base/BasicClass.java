package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicClass {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Browser Configuration
		//WebDriver=Interface
		//Driver=Reference Variable
		//Chrome Browser		
		//set Browser
		
		System.setProperty("webdriver.chrome.driver", "D:\\Course online\\Software Test\\chromedriver.exe");
		
		//Open Real Browser		
		//Chrome Driver
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://ms.agsapps.com");
		int width=driver.manage().window().getSize().getWidth();
		int height=driver.manage().window().getSize().getHeight();
		System.out.println("Width: "+ width + "height" + height);
		Thread.sleep(5000);
		driver.close();

		
		//Firefox Browser
		System.setProperty("webdriver.gecko.driver", "D:\\Course online\\Software Test\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		int Width1=driver.manage().window().getSize().getWidth();
		int Height1=driver.manage().window().getSize().getHeight();
		driver.manage().window().getSize().getHeight();
		System.out.println("widht:" +Width1 + "Height" + Height1);
		driver.manage().deleteAllCookies();
		driver.get("http://ms.agsapps.com");
		Thread.sleep(5000);
		driver.close();
	}
	
		//close Browser
		public static void closeBrowser() {
		driver.close();		
		}
	public static void openHomepage() {
		driver.get("https:demo.opencart.com/");
		
	}
	
}
 