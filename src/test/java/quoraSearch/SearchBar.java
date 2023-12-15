package quoraSearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class SearchBar {

	 public static void search(WebDriver driver){
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		String Search = ReadFromExcel.search;
   
        // Search for "Testing"
        WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/input"));
        searchBar.click();
        
        searchBar.sendKeys(Search);
        
        List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='q-box puppeteer_test_selector_result']"));
        if (!searchResults.isEmpty()) 
        {
            searchResults.get(0).click();
        }
    }
}
