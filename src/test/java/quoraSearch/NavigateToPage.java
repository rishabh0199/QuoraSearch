package quoraSearch;

import org.openqa.selenium.WebDriver;

public class NavigateToPage {

    public static void navigateToQuora(WebDriver driver) {
        //Maximize the page
    	driver.manage().window().maximize();
    	
    	// Navigate to Quora
    	try
    	{
        driver.get("https://www.quora.com/profile/Quora");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
