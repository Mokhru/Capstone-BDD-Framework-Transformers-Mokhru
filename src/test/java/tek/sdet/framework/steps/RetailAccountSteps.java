package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	}
	//update profile
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, DataGeneratorUtility.data(nameValue));
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, DataGeneratorUtility.data(phoneValue));
		logger.info("user updated Name and Phone values ");
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");
	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	// update password
	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> passwordInform = dataTable.asMaps(String.class, String.class);

	    sendText(factory.accountPage().profilePreviousPasswordField,
	        passwordInform.get(0).get("previousPassword"));
	    sendText(factory.accountPage().profileNewPasswordField, passwordInform.get(0).get("newPassword"));
	    sendText(factory.accountPage().profileNewPassConfimField, passwordInform.get(0).get("confirmPassword"));

	    logger.info("User entered old password   and updated to new password'" );
	 
	}
	
	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().profileChangePasswordButton);
	    logger.info("User clicked on change Password Button");
	
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully(String expectMessage) {
		waitTillPresence(factory.accountPage().passwordUpdateSuccessMessage);
		Assert.assertEquals(expectMessage, factory.accountPage().passwordUpdateSuccessMessage.getText());
		logger.info(expectMessage);
	   
	}
	//add new card
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPayment);
		logger.info("User clicked on Add a payment");
		
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) throws InterruptedException {
		
		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput,DataGeneratorUtility.data(cardInfo.get(0).get("cardNumber")));
		sendText(factory.accountPage().nameOnCardInput,DataGeneratorUtility.data(cardInfo.get(0).get("nameOnCard")));
		sendText(factory.accountPage().cardExpMonthInput, cardInfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().cardExpYearInput, cardInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().cardSecCodeInput, cardInfo.get(0).get("securityCode"));
		logger.info("Usser filled card info");
		
	}
	
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User click on Add Your Card Button");
	    
	}
	@Then("Card added message should be displayed {string}")
	public void cardMessageShouldBeDisplayed(String cardexpectMessage) {
		waitTillPresence(factory.accountPage().cardAddedSuccesfullyMessage);
		Assert.assertEquals(cardexpectMessage, factory.accountPage().cardAddedSuccesfullyMessage.getText());
		logger.info(cardexpectMessage);
		
		
	}
	//Edit Card
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection(){
		click(factory.accountPage().cardSelectButton);
		click(factory.accountPage().cardEditButton);
		logger.info("User choose first card and clicked in Edit Button");
	    
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable){
		List<Map<String, String>> cardUpdateInfo = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().editCardNumberInput);
		sendText(factory.accountPage().editCardNumberInput,DataGeneratorUtility.data(cardUpdateInfo.get(0).get("cardNumber")));
		clearTextUsingSendKeys(factory.accountPage().editNameOnCardInput);
		sendText(factory.accountPage().editNameOnCardInput,DataGeneratorUtility.data(cardUpdateInfo.get(0).get("nameOnCard")));
		sendText(factory.accountPage().editExpMonthOnCardInpu, cardUpdateInfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().editExpYearOnCardInput, cardUpdateInfo.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().editSecCodeonCard);
		sendText(factory.accountPage().editSecCodeonCard, cardUpdateInfo.get(0).get("securityCode"));
		logger.info("Usser filled updated card info");
	    
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateCardButton);
		logger.info("user clicked on update button");
	   
	}
	@Then("Card updated message should be displayed {string}")
	public void cardUpdatedMessageShouldBeDisplayed(String cardUpdatedexpectMessage) {
		waitTillPresence(factory.accountPage().updateCardSuccessMessage);
		Assert.assertEquals(cardUpdatedexpectMessage, factory.accountPage().updateCardSuccessMessage.getText());
		logger.info(cardUpdatedexpectMessage);
		
	}
	
	//remove card
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cardSelectButton);
		logger.info("User selected card for remove");
	   
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		String removedCard = getText(factory.accountPage().cardSelectButton);
		click(factory.accountPage().removeCardButton);
		logger.info(removedCard + " Card removed successfully!");
		  
	}
	    

// add new address
	@When("User click on  Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("user clicked on Add address option");

	}
	@When("User fill new address form with below information")
	public void userFllNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> addressInfo = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().country,DataGeneratorUtility.data(addressInfo.get(0).get(0)));
		sendText(factory.accountPage().fullNameField,DataGeneratorUtility.data(addressInfo.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberField,DataGeneratorUtility.data(addressInfo.get(0).get(2)));
		sendText(factory.accountPage().streetAddressField, DataGeneratorUtility.data(addressInfo.get(0).get(3)));
		sendText(factory.accountPage().apartmentNumber, DataGeneratorUtility.data(addressInfo.get(0).get(4)));
		sendText(factory.accountPage().cityField,DataGeneratorUtility.data(addressInfo.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateDropDown,DataGeneratorUtility.data(addressInfo.get(0).get(6)));
		sendText(factory.accountPage().zipCodeField,DataGeneratorUtility.data(addressInfo.get(0).get(7)));
		logger.info("user filled the new address form with information provided in data table");

	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("user clicked on Add your Address button");
	}
	@Then("Address message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		waitTillPresence(factory.accountPage().addressAddedSuccessfullyMessage);
		Assert.assertEquals(expectedMessage, factory.accountPage().addressAddedSuccessfullyMessage.getText());
		

	}
}
