package quoraSearch;

import org.openqa.selenium.WebDriver;

public class VerifyTitle {
	
	public static void titleVerify(WebDriver driver) {
		
		String SearchTopic = ReadFromExcel.search;
		String pageTitle = driver.getTitle();
		System.out.println("Page Title: " + pageTitle);
    
		if(SearchTopic.equals(pageTitle))
		{
			System.out.println("Search topic and Title Matches");
		}
		else
		{
			System.out.println("Search topic and title not matches");
		}
	}
}