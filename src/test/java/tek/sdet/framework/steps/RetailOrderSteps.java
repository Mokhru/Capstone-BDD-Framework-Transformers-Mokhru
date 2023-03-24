package tek.sdet.framework.steps;

import org.junit.Assert;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	//cancel Order
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().orderButton);
		logger.info("User clicked on Orders section");
	   
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		for(int i= 0; i<factory.orderPage().hiddenButtons.size(); i++) {
			
			if(factory.orderPage().hiddenButtons.get(i).getText().equalsIgnoreCase("Show Details")) {
				System.out.println((i));
				click(factory.orderPage().hiddenButtons.get(i));
			}
				
			}
		
		logger.info("User clicked on first order in list for cancel order");
		
	    
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelButton);
		logger.info("User clicked in Cancel the Order Button");
	   
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reasonCancelOption) {
		selectByVisibleText(factory.orderPage().cancelReason, reasonCancelOption);
		logger.info("User selected the cancelation reason " + reasonCancelOption);
	    
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelReasonButton);
		logger.info("User clicked on Cancel order Button");
		
	   
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancelReasonMessageExpact) {
		Assert.assertEquals(factory.orderPage().cancelConfirmMessage.getText(), cancelReasonMessageExpact);
		logger.info(cancelReasonMessageExpact);
	   
	}
	//return Order
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnButton);
		logger.info("User Clicked on first return Button");
	    
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reasonReturnOption) {
		selectByVisibleText(factory.orderPage().cancelReason, reasonReturnOption);
		logger.info("User selected the cancelation reason " + reasonReturnOption);
	    
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String droppOffService) {
		selectByVisibleText(factory.orderPage().droppOffInput, droppOffService);
		logger.info("User select the dropp off service " + droppOffService);
	    
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnButtonSubmit);
		logger.info("User clicked on Return Button");
	   
	}
	@Then("a return message should be displayed {string}")
	public void aReturnMessageShouldBeDisplayed(String returnMessageExpact) {
		Assert.assertEquals(factory.orderPage().returnOrderMessage.getText(), returnMessageExpact);
		logger.info(returnMessageExpact);
	    
	}
//review Order
@When("User click on Review button")
public void userClickOnReviewButton() {
	click(factory.orderPage().reviewButton);
	logger.info("User clicked on Review Button");
    
}
@When("User write Review headline {string} and {string}")
public void userWriteReviewHeadlineAnd(String headlineMessage, String reviewMessage) {
	sendText(factory.orderPage().reviewHeadlineInput, headlineMessage);
	sendText(factory.orderPage().reviewTextInput, reviewMessage);
	logger.info("User added Hedline " + headlineMessage + " and added comment message " + reviewMessage );
    
}
@When("User click Add your Review button")
public void userClickAddYourReviewButton() {
	click(factory.orderPage().reviewSubmitButton);
	logger.info("User clicked on Add Review Button");
  
}
@Then("Review message should be displayed {string}")
public void reviewMessageShouldBeDisplayed(String reviewMessageExpact) {
	waitTillPresence(factory.orderPage().reviewSuccessMessage);
	Assert.assertEquals(reviewMessageExpact, factory.orderPage().reviewSuccessMessage.getText());
	logger.info(reviewMessageExpact);
   
}



	

}
