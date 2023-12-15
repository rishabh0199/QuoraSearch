package quoraSearch;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShot {
	public static void screenshot(WebDriver driver)
	{
		try
		{	
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("C:\\Users\\risha\\eclipse-workspace\\QuoraSearch\\Screenshots\\Error.png");
        FileUtils.copyFile(src,trg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
