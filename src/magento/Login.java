package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login extends Parameters {

	@Test
    public void testLogin() {
        
        WebElement loginAccount = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
        loginAccount.click(); 

        Signup signup = new Signup();
        String loginEmail = signup.getGeneratedEmail();

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(loginEmail);

        WebElement loginPassword = driver.findElement(By.id("pass"));
        loginPassword.sendKeys("asac1234@#$A"); 

        WebElement loginButton = driver.findElement(By.id("send2"));
        loginButton.click();
        
	}

}
