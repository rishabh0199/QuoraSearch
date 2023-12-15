package quoraSearch;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInSignUp  {

		public static void signInSignUp(WebDriver driver)throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
        // Click on "Sign In" link
        WebElement signInButton = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]/div[2]/div/div[2]/div/button/div/div/div"));
        signInButton.click();

        // Verify if the "Sign Up" button is disabled
        WebElement signUpButton = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[2]/div/span/span[4]/div"));
        boolean isSignUpButtonEnabled = signUpButton.isEnabled();
        if (isSignUpButtonEnabled) 
        {
            System.out.println("The signup button is enabled");
        } 
        else 
        {
            System.out.println("The signup button is disabled");
        }
        
        
        // Click on "Sign up with email" link
        WebElement signUpWithEmailLink = driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div/div/div[2]/div/span/span[4]/div"));
        signUpWithEmailLink.click();


        
        //Enter name
        String Name = ReadFromExcel.name;
        String Email = ReadFromExcel.email;
        driver.findElement(By.xpath("//*[@id=\"profile-name\"]")).sendKeys(Name);
  
        // Enter an invalid email
        Thread.sleep(3000);
        WebElement emailField = driver.findElement(By.xpath("//*[@id='email']"));
        emailField.sendKeys(Email);

        // Verify and capture the respective error message
        WebElement errorMessageElement = driver.findElement(By.xpath("//*[@id='form-field-error:37']/div"));
        String errorMessage = errorMessageElement.getText();
        System.out.println("Error message: " + errorMessage);
   
    }
}

