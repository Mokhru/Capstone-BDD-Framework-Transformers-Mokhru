package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	@FindBy(xpath = "//a[@id='orderLink']")
	public WebElement orderButton;
	
	@FindBy(xpath = "//p[@class ='order__header-btn']")
	public List<WebElement> hiddenButtons;
	
	@FindBy(xpath = "(//button[contains(text(),'Cancel The Order')])[1]")
	public WebElement firstCancelButton;
	
	@FindBy(css = "#cancelBtn")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement cancelReason;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelReasonButton;
	
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelConfirmMessage;
	
	@FindBy(css = "#returnBtn")
	public WebElement returnButton;
	
	@FindBy(xpath = "//select[@id='dropOffInput']")
	public WebElement droppOffInput;
	
	@FindBy(xpath = "//button[@id='orderSubmitBtn']")
	public WebElement returnButtonSubmit;
	
	@FindBy(xpath = "//p[contains(text(),'Return was successfull')]")
	public WebElement returnOrderMessage;
	
	@FindBy(xpath = "//button[@id='reviewBtn']")
	public WebElement reviewButton;
	
	@FindBy(xpath = "//input[@id='headlineInput']")
	public WebElement reviewHeadlineInput;
	
	@FindBy(xpath = "//textarea[@id='descriptionInput']")
	public WebElement reviewTextInput;
	
	@FindBy(xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmitButton;
	
	@FindBy(xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewSuccessMessage;
	
	
	

}
