package Com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeSuite;

public class ExcelDataReader {
	XSSFWorkbook wb;
	public ExcelDataReader() throws Exception {
		String path = "C:\\Users\\other\\eclipse-workspace\\Framework_Project\\TestData\\Data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		 wb = new XSSFWorkbook(fis);
	}//string data
	public String getStringData(String Sheetname,int row,int cell) {
	return	wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	//Numeric data
public String getNumericData(String Sheetname,int row,int cell) {
	double data= wb.getSheet(Sheetname).getRow(row).getCell(cell).getNumericCellValue();
return String.valueOf(data);

}

}

