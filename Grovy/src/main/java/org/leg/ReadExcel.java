package org.leg;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static XSSFRow	row;
	public static void main(String[] args) throws Throwable {
	String	FileLocation = "C:\\Users\\josephstephenraja.p\\OneDrive - Optisol Business Solutions Private Limited\\Desktop\\rest assured\\Appium\\Grovy\\TestData.xlsx";
	XSSFWorkbook work = new XSSFWorkbook(FileLocation);
	XSSFSheet sheet =work.getSheet("Sheet2");
	int lastnum = sheet.getLastRowNum();
	short lastCellNum = sheet.getRow(0).getLastCellNum();
	
	for (int i = 1; i <=lastnum; i++) {
		XSSFRow	row = sheet.getRow(i);	
	for (int j = 0; j < lastCellNum; j++) {
		XSSFCell cell = row.getCell(j);
		String value = cell.getStringCellValue();
		System.out.println(value);
	}
	

	}

	}
	
	public static String excelRead1(String sheetname, int rowNum, int cellNum ) throws IOException {
		String fileLoc = "C:\\\\Users\\\\josephstephenraja.p\\\\OneDrive - Optisol Business Solutions Private Limited\\\\Desktop\\\\rest assured\\\\Appium\\\\Grovy\\\\TestData.xlsx";

		XSSFWorkbook work = new  XSSFWorkbook(fileLoc);
		XSSFSheet sheet = work.getSheet(sheetname);
	XSSFRow row =	sheet.getRow(rowNum);
	XSSFCell cell = row.getCell(cellNum);
	String data =cell.toString();
	return data;
	
	
		
        
		
		
		
	}
}
