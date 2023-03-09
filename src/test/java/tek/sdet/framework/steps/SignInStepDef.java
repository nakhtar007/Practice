package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInStepDef extends CommonUtility {

	private POMFactory factory = new POMFactory();
	
	@Given("User is on tek retail website")
	public void userIsOnTekRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
	}
	@When("User click on signIn button")
	public void userClickOnSignInButton() {
		click(factory.homePage().signInButton);
		logger.info("User clicked on sign in button");
	    
	}
	@When("User enters email {string} and password {string}")
	public void userEntersEmailAndPassword(String emailValue, String passValue) {
	    sendText(factory.signInPage().emailField,emailValue);
	    sendText(factory.signInPage().passwordField,passValue);
	    logger.info("User entered email "+emailValue+"and password "+passValue);
	}
	
	@And ("User click on login button")
	public void userClickOnLoginInButton() {
		click(factory.signInPage().loginPageButton);
		logger.info("User clicked on login button");
		
	}
	
	
	@Then("User should be logged in")
	public void userShouldBeLoggedIn() {
	Assert.assertTrue(isElementDisplayed(factory.accountHomePage().accountButton));
	logger.info("Account button is Displayed");
	    
	}
	
	@When("User click on CreateNewAccount button")
	public void userClickOnCreateNewAccountButton() {
	    click(factory.signInPage().createNewAccountButton);
	    logger.info("User clicked on Create New Account");
	}
	@When("User fill the signUp information with below data {string} {string} {string} {string}")
	public void userFillTheSignUpInformationWithBelowData(String name, String email, String pass,String confirmPass ) {
		sendText(factory.signInPage().accountCreationNameField,name);
		sendText(factory.signInPage().accountCreationEmailField,email);
		sendText(factory.signInPage().accountCreationPasswordField,pass);
		sendText(factory.signInPage().accountCreationConfirmPassField,confirmPass);
		logger.info("User filled the info");
	    
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().accountCreationSignUpButton);
		logger.info("User clicked on Sign Up button");
	   
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountButton));
		logger.info("User is logged into the account");
	    
	}

}
