package magento;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Signup extends Parameters {

	private String generatedEmail; 
	
	@Test
	public void createAccount() {

		WebElement createAccount = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		createAccount.click();

		Random random = new Random();
		int randomIndex = random.nextInt(4);
		String[] firstNameList = { "Khadijah", "Marah", "Tasneem", "Fatema" };
		String[] lastNameList = { "Ramzi", "Rami", "Ahmad", "Adam" };
		String firstName = firstNameList[randomIndex];
		String lastName = lastNameList[randomIndex];

		WebElement firstNameField = driver.findElement(By.id("firstname"));
		firstNameField.sendKeys(firstName);

		WebElement lastNameField = driver.findElement(By.id("lastname"));
		lastNameField.sendKeys(lastName);

		int randomNumber = random.nextInt(1000);
        generatedEmail = firstName + randomNumber + "@gmail.com";
        WebElement emailField = driver.findElement(By.id("email_address"));
        emailField.sendKeys(generatedEmail);

		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("asac1234@#$A");

		WebElement confirmPasswordField = driver.findElement(By.id("#password-confirmation"));
		confirmPasswordField.sendKeys("asac1234@#$A");
		
		WebElement signupButton = driver.findElement(By.id("signup-button"));
		signupButton.click();

		}
	
		public String getGeneratedEmail() {
	        return generatedEmail;
	    }

}
