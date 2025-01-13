package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtils 
{

	 XSSFWorkbook wb;
	 //constructor for reading path
	
	 public ExcelFileUtils(String ExcelPath) throws IOException
	 {
		 
		FileInputStream fi = new FileInputStream(ExcelPath) ;
		wb = new XSSFWorkbook(fi);
	 }
	 
	 
	 
}
