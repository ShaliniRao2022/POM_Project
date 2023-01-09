package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	
	WebDriver driver;
	
//	Test Data	
	String userName = "demo@techfios.com";
	String password = "abc123";
	String dashboardValidationText = "Dashboard";
	String addContactValidationText = "Add Contact";
	String fullName = "Selenium";
	String company ="Techfios";
	String email = "abc@techfios.com";
	String phoneNum = "456-7891";
	String address = "2741 Belt Line Road";
	String city = "Dallas";
	String state = "Texas";
	String zipcode = "75006";
	String country = "United States";
	
	@Test
	public void userShouldBeAbleToAddCustomer() {
		
     driver = BrowserFactory.init();
		
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage(dashboardValidationText);
		dashboardPage.clickCustomersButton();
		dashboardPage.clickAddCustomerButton();
		
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.validateAddContactPage(addContactValidationText);
		addContactPage.insertFullName(fullName);
		addContactPage.selectCompany(company);
		addContactPage.insertEmail(email);
		addContactPage.insertPhoneNumber(phoneNum);
		addContactPage.insertAddress(address);
		addContactPage.insertCity(city);
		addContactPage.insertState(state);
		addContactPage.insertZipcode(zipcode);
		addContactPage.selectCountry(country);
		addContactPage.clickSaveButton();
		
		
	}

}
