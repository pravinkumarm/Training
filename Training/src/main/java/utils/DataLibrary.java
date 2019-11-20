package utils;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

	public static String[][] dataloader(String Exceldata) throws IOException {

		FileInputStream fis = new FileInputStream("./data/" + Exceldata + ".xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[row][col];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {
				String cellvalue = sheet.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = cellvalue;

			}
		}
		return data;

	}
}
