package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this); 
		// we are implementing PageFactory class to initialize the UI Elements 
		// using initElements method of PageFactory class
		// this method accepts two parameters, first one is driver and second 
		// is this keyword which referees to variable of this class in this case
		// we are referring to UI elements that will store in this class
	}
	
	@FindBy(xpath ="//h1[text()='Sign in']")
	public WebElement signPageLogo;
	
	@FindBy(id ="email")
	public WebElement emailField;
	
	@FindBy(id ="password")
	public WebElement passwordField;
	
	@FindBy(xpath ="//button[text()='Login']")
	public WebElement loginPageButton;
	
	@FindBy(linkText ="Create New Account")
	public WebElement createNewAccountButton;
	
	@FindBy(id ="newCompanyAccount")
	public WebElement  wantToSellSomethingLink;
	@FindBy(id = "accountLink")
	public WebElement accountButton;
	@FindBy(xpath = "//input[contains(@name,'name')]")
	public WebElement accountCreationNameField;
	@FindBy(id = "emailInput")
	public WebElement accountCreationEmailField;
	@FindBy(id = "passwordInput")
	public WebElement accountCreationPasswordField;
	@FindBy(id = "confirmPasswordInput")
	public WebElement accountCreationConfirmPassField;
	@FindBy(id = "signupBtn")
	public WebElement accountCreationSignUpButton;
	
	
	
}
