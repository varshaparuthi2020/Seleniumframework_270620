package util;

public class ExcelUtilsdemo {
	static String projectpath = System.getProperty("user.dir");	
	public static void main(String[] args) {
		ExcelUtils excel = new ExcelUtils(projectpath+"\\Excel\\data.xlsx", "Sheet1");
		excel.getcellDataString(1, 1);
		excel.getcellDataNumeric(2, 1);
	}


}
