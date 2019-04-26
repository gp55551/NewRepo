package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.codec.language.bm.Rule.RPattern;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//readExcel();
		writeExcel();
	}
	//read excel data
	public static void readExcel() throws IOException {
		try {
			Workbook wb;
			File f = new File("D:\\workspaceDec\\GauravLearnApril\\ReadExcel.xlsx");
			FileInputStream fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);

			Sheet sh = wb.getSheetAt(0);
			int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
			// System.out.println(rowCount);

			for (int i = 0; i <= rowCount; i++) {
				Row r = sh.getRow(i);
				int colCount = r.getLastCellNum();
				// System.out.println(colCount);
				for (int j = 0; j < colCount; j++) {
					System.out.println(r.getCell(j).getStringCellValue());
				}
				System.out.println("--------------------" + "" + "");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new Throwable("Cell is empty");
		}

	}
	// write data into excel
	public static void writeExcel() throws IOException {
		try {
			String[] dataToWrite = {"Gaurav","Infy"};
			Workbook wb;
			File f = new File("D:\\workspaceDec\\GauravLearnApril\\ReadExcel.xlsx");
			FileInputStream fis = new FileInputStream(f);
			wb = new XSSFWorkbook(fis);

			Sheet sh = wb.getSheetAt(0);
			int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
			// System.out.println(rowCount);
			Row row = sh.getRow(0);
			Row newRow = sh.createRow(rowCount+1);
			for(int j = 0 ; j<row.getLastCellNum();j++)
			{
				newRow.createCell(j).setCellValue(dataToWrite[j]);
			}
			fis.close();
			
			//file output stream
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			fos.close();
			
			System.out.println("write succesful");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			new Throwable("Cell is empty");
		}

	}

}
