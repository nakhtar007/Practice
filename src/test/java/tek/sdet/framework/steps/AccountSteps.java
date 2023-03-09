package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class AccountSteps extends CommonUtility {
	POMFactory factory = new POMFactory();
	
	@When("user click on Account button")
	public void userClickOnAccountButton() {
		click(factory.accountHomePage().accountButton);
		logger.info("User clicked on AccountButton");
	   
	}
	@When("user update name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountHomePage().accountPageNameField);
		clearTextUsingSendKeys(factory.accountHomePage().accountPagePhoneField);
		
		sendText(factory.accountHomePage().accountPageNameField,name);
		sendText(factory.accountHomePage().accountPagePhoneField,phone);
		logger.info("User updated the profile value");
	   
	}
	@When("user click on updateButton")
	public void userClickOnUpdateButton() {
		click(factory.accountHomePage().accountPageUpdateButton);
		logger.info("User clicked on update button");
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountHomePage().successPopUpMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successPopUpMessage));
	   logger.info("User updated the profile information successfully");
	}
	
	@When("User enters below information")
	public void userEntersBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> signUpInformation = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountHomePage().previousPasswordField,signUpInformation.get(0).get("previousPassword"));
	    sendText(factory.accountHomePage().newPasswordField,signUpInformation.get(0).get("newPassword"));
	    sendText(factory.accountHomePage().confirmPasswordField,signUpInformation.get(0).get("confirmPassword"));
	}

	@When("User click on Change password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountHomePage().changePasswordButton);
		logger.info("User clicked on change password button");
	   
	}
	@Then("a message shoud be displayed \\(Password Updated Successfully)")
	public void aMessageShoudBeDisplayedPasswordUpdatedSuccessfully() {
		waitTillPresence(factory.accountHomePage().successPasswordUpdatePopupMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successPasswordUpdatePopupMessage));
		logger.info("PasswordUpdatedSuccessfully");
	    
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.accountHomePage().addAddressOption);
	    logger.info("User clicked on add address option successfully");
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> addAddressInfo = dataTable.asMaps(String.class, String.class);
	    selectByValue(factory.accountHomePage().addressSectionCountryDropDown,addAddressInfo.get(0).get("country"));
	    sendText(factory.accountHomePage().addressSectionNameInputField,addAddressInfo.get(0).get("fullName"));
	    sendText(factory.accountHomePage().addressSectionPhoneNumberInputField,addAddressInfo.get(0).get("phoneNumber"));
	    sendText(factory.accountHomePage().addressSectionAddressInputField,addAddressInfo.get(0).get("streetAddress"));
	    sendText(factory.accountHomePage().addressSectionAptNoInputField,addAddressInfo.get(0).get("apt"));
	    sendText(factory.accountHomePage().addressSectionCityInputField,addAddressInfo.get(0).get("city"));
	    selectByValue(factory.accountHomePage().addressSectionStateDropDown,addAddressInfo.get(0).get("state"));
	    sendText(factory.accountHomePage().addressSectionZipCodeInputField,addAddressInfo.get(0).get("zipCode"));
	    logger.info("User successfully filled the form");
	    		
	    	
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	   click(factory.accountHomePage().addressSectionAddAddressButton);
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountHomePage().successAddAddressPopUpMessag);
		Assert.assertTrue(isElementDisplayed(factory.accountHomePage().successAddAddressPopUpMessag));
		logger.info("User successfully added a new address");
		
		
	}



	
	
}