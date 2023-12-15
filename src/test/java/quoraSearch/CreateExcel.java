package quoraSearch;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {
	public static void writeExcel(){
		
		try
		{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();

		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Search");
		row1.createCell(1).setCellValue("Name");
		row1.createCell(2).setCellValue("Email");
		row1.createCell(3).setCellValue("Verify");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Testing");
		row2.createCell(1).setCellValue("Rishabh");
		row2.createCell(2).setCellValue("abc@abc");
		row2.createCell(3).setCellValue("Results for Testing");
		
		workbook.write(file);
		workbook.close();
		file.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

		
	}

}
