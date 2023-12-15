package quoraSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class VerifyTextOnPage {
	
	public static void verifyText(WebDriver driver){
		
		String expectedText = ReadFromExcel.verify;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List <WebElement> total_result = driver.findElements(By.xpath("//div[@class=\"q-box\"][2]/div/div/div[2]/div/div/div"));
		for(int i=0;i<=total_result.size();i++)
			{
				if(expectedText.equalsIgnoreCase(total_result.get(i).getText()))
					{
						System.out.println("The text " + expectedText +" is present on page");
						break;
					}
				else
					{
						System.out.println("The text " + expectedText +" is not present on page");
						break;
					}
			}
 
		}

}
