package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
//	WebElement userNameElement = driver.findElement(By.xpath("//input[@id='username']"));
//	By userNameField = By.xpath("//input[@id='username']");
	
//	List of Web Elements	
	@FindBy(how=How.XPATH, using = "//input[@id='username']")WebElement userNameElement;
	@FindBy(how=How.XPATH, using = "//input[@id='password']")WebElement passwordElement;
	@FindBy(how=How.XPATH, using = "//button[@name='login']")WebElement signInButton;
	
//	Corresponding Methods
	
	public void insertUserName(String userName) {
		
		userNameElement.sendKeys(userName);
	}

	public void insertPassword(String password) {
		
		passwordElement.sendKeys(password);
	}

	public void clickSignInButton() {
		
		signInButton.click();
	}
	
	public void loginTest(String userName, String password ) {
		userNameElement.sendKeys(userName);
		passwordElement.sendKeys(password);
		signInButton.click();
	}
}
