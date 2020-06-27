package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports {
	
	private static WebDriver driver = null;
	
 public static void main(String[] args) {
	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreports.html");
//create extentreports and attch report
	
	ExtentReports extent = new ExtentReports();
extent.attachReporter(htmlreporter);
	
	ExtentTest test1= extent.createtest("seacrh in google","This is testcase for it");
	
	
	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();
	test1.log(Status.INFO,"Starting testcase");
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	test1.pass("google browse");
	driver.findElement(By.name("q")).sendKeys("hello");
	test1.pass("search hello");
	driver.findElement(By.name("btnK")).submit();
	
	test1.pass("click done");
	driver.close();
	driver.quit();
	test1.pass("details search successfully");


 }


}
