package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataprovider {
WebDriver driver = null;
	
	@BeforeTest
	public void setupTest(){
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

/*	public static void main(String[] args) {

		String projectpath = System.getProperty("user.dir");	
		//projectpath+"\\Excel\\data.xlsx"
		testdata(projectpath+"\\Excel\\data.xlsx", "Sheet1");
	}
*/
	@Test(dataProvider="testdata")
	public void test1(String username,String password) throws Exception{
		
		System.out.println(username+ " | "+password );
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		Thread.sleep(2000);
	}
	
	
	@DataProvider(name = "testdata")
	public static Object getData(){
		String projectpath = System.getProperty("user.dir");	
		//projectpath+"\\Excel\\data.xlsx"
		Object data=testdata(projectpath+"\\Excel\\data.xlsx", "Sheet1");
	return data;
	}
	
	
	
	public static Object  testdata(String excelPath , String  sheetName){

		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		int rowCount=excel.getRowCount();
		int colCount =excel.getcolCount() ;

		
		Object data[][] = new Object[rowCount-1][colCount];
		for (int i =1;i<rowCount;i++){

			for(int j=0;j<colCount;i++){
				String celldata= excel.getcellDataString(i, j);
				//System.out.println("print data in excel"+celldata);
				//System.out.print("celldata is "+celldata+" |");
				data[i-1][j]=celldata;
			}
			System.out.println();
		}
		return data;
	}
}
