package quoraSearch;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

public class ReadFromExcel {
	public static String search;
	public static String name;
	public static String email;
	public static String verify;
	
	public static void readfromexcel(WebDriver driver)
	{
		try
		{
		String file = System.getProperty("user.dir")+"\\TestData\\testdata.xlsx";
		int rows = ExcelUtils.getRowCount(file, "Sheet0");
		
		for(int i=1;i<=rows;i++)
		{
			 search=ExcelUtils.getCellData(file, "Sheet0", i, 0);
		
			  name=ExcelUtils.getCellData(file, "Sheet0", i, 1);
			
			 email=ExcelUtils.getCellData(file, "Sheet0", i, 2);
			
			 verify=ExcelUtils.getCellData(file, "Sheet0", i, 3);
			
			
		}
		}
		 catch (IOException e) 
		{
	            // Handle the IOException (e.g., log it or print a message)
	            e.printStackTrace();
	    } 
		catch (Exception e) 
		{
	            // Handle other exceptions (if any)
	            e.printStackTrace();
	     }
	}

}

