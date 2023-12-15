package quoraSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	private static WebDriver driver;
	public static String browserType;

	public static WebDriver getDriver(String browser){
	 	browserType = browser;
	 	{
	 		if(browserType.equalsIgnoreCase("chrome"))
	 		{
	 			WebDriverManager.chromedriver().setup();
	 			 driver = new ChromeDriver();	
	 		}
	 		
	 		else if(browserType.equalsIgnoreCase("edge"))
	 		{
	 			WebDriverManager.edgedriver().setup();
	 			 driver = new EdgeDriver();
	 		}		
	 		
	 		else
	 		{
	 			System.out.println("We only have Chrome and Edge availble for now");
	 		}
	 		
	 	}
	 	
	 	return driver;
 	}
}
