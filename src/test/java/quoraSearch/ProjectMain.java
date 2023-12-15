package quoraSearch;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;

public class ProjectMain {
	
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("Enter browser name on which you want to run Script (Type 'close' to Exit):");
            // Convert to lowercase for case-insensitive comparison
            String browse = sc.nextLine().toLowerCase(); 

            if (browse.equals("chrome") || browse.equals("edge")) 
            {
               WebDriver driver = DriverSetup.getDriver(browse);

                try 
                {
                    CreateExcel.writeExcel();
                    NavigateToPage.navigateToQuora(driver);
                    ReadFromExcel.readfromexcel(driver);
                    SearchBar.search(driver);
                    VerifyTitle.titleVerify(driver);
                    VerifyTextOnPage.verifyText(driver);
                    SignInSignUp.signInSignUp(driver);
                    TakeScreenShot.screenshot(driver);
                } 
                catch (Exception e) 
                {
                    e.printStackTrace();
                } 
                finally 
                {
                    // Close the browser after execution
                    driver.quit();
                }
            } 
            else if (browse.equals("close")) 
            {
                // User wants to exit
                System.out.println("Exiting the program.");
                break;
            } 
            else 
            {
                // Invalid browser input, ask again
                System.out.println("Invalid browser. Please enter 'chrome' or 'edge'.");
            }
        }

        // Always close the Scanner in a finally block to ensure it gets closed
        if (sc != null) 
        {
            sc.close();
        }
    }
}
	

	




