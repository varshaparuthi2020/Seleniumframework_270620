package util;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

static XSSFWorkbook wb;
static XSSFSheet sheet;

//constrcutor define

public ExcelUtils(String excelPath,String sheetName){
		
	 try {
		wb = new XSSFWorkbook(excelPath);
		 sheet = wb.getSheet(sheetName);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
}
//static String projectpath = System.getProperty("user.dir");	
	public static void main(String[] args) {
		//getrowcount();
//getcellDataString(0,1);
//getcellDataNumeric(0, 2);
	}
	public static int getRowCount(){
int rowCount=0;
		try{	
			//projectpath= System.getProperty("user.dir");		
		 //wb = new XSSFWorkbook(projectpath+"//Excel//data.xlsx");
		//	 sheet = wb.getSheet("Sheet1");
			 rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows:"+sheet.getPhysicalNumberOfRows());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}

	
	
	//method to get total columns count
	
public static int getcolCount()
{
	int colCount=0;
		try{	
			//projectpath= System.getProperty("user.dir");		
		 //wb = new XSSFWorkbook(projectpath+"//Excel//data.xlsx");
		//	 sheet = wb.getSheet("Sheet1");
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No. of column:"+colCount);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
}
 
	
	public static  String getcellDataString(int rowNum, int colNum){
	String celldata=null;
		try{	
		//	projectpath= System.getProperty("user.dir");		
		 //wb = new XSSFWorkbook(projectpath+"//Excel//data.xlsx");
			 //sheet = wb.getSheet("Sheet1");
		 celldata=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Celldata is "+celldata);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return celldata;
	}

	public static Double getcellDataNumeric(int rowNum, int colNum){
		 Double celldatanumeric=null;
		try{	
			//projectpath= System.getProperty("user.dir");		
		// wb = new XSSFWorkbook(projectpath+"//Excel//data.xlsx");
			// sheet = wb.getSheet("Sheet1");
		 celldatanumeric=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("Celldata is "+celldatanumeric);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return celldatanumeric;
	}
}
