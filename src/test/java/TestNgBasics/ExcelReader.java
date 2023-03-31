package TestNgBasics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	/*
	 * Steps:
	 * 1. Add 2 dependencies (poi, poi-ooxml)
	 * 2. Get the file path
	 * 3. Create workbook object
	 * 4. Get the sheet from the workbook
	 * 5. How many rows are there
	 * 6. How many columns are there
	 * 
	 */
	
	public Object[][] getData() throws IOException {
		String filePath= "./src/test/java/TestNgBasics/ExcelTestData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet("data");
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowcount][colcount];
		for (int row = 0; row < rowcount; row++) {
			for (int col = 0; col < colcount; col++) {
				data[row][col] = sheet.getRow(row).getCell(col).getStringCellValue();
			}
		}
		
		return data;
	}
	
}
