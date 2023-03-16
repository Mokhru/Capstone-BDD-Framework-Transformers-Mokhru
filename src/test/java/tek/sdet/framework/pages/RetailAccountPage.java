package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;

	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;

	@FindBy(id = "personalPhoneInput")
	public WebElement profilePhoneNumberField;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement profileUpdateButton;

	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateSuccessMessage;

	@FindBy(id = "previousPasswordInput")
	public WebElement profilePreviousPasswordField;

	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement profileNewPasswordField;

	@FindBy(css = "#confirmPasswordInput")
	public WebElement profileNewPassConfimField;

	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement profileChangePasswordButton;

	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passwordUpdateSuccessMessage;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	  public WebElement addPayment;

	  @FindBy(xpath = "//input[@id='cardNumberInput']")
	  public WebElement cardNumberInput;

	  @FindBy(xpath = " //input[@id='nameOnCardInput']")
	  public WebElement nameOnCardInput;

	  @FindBy(xpath = "//select[@id='expirationMonthInput']")
	  public WebElement cardExpMonthInput;

	  @FindBy(css = "#expirationYearInput")
	  public WebElement cardExpYearInput;

	  @FindBy(xpath = "//input[@id='securityCodeInput']")
	  public WebElement cardSecCodeInput;

	  @FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	  public WebElement addYourCardButton;

	  @FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	  public WebElement cardAddedSuccesfullyMessage;
  
	  @FindBy(xpath = "(//div[@class = 'false account__payment-item'])[1]")
	  public WebElement cardSelectButton;

	  @FindBy(xpath = "(//button[contains(text(), 'Edit')])[1]")
	  public WebElement cardEditButton;

	  @FindBy(xpath = "//input[@id='cardNumberInput']")
	  public WebElement editCardNumberInput;

	  @FindBy(xpath = "//input[@id='nameOnCardInput']")
	  public WebElement editNameOnCardInput;
	  
	  @FindBy(xpath = "//select[@id='expirationMonthInput']")
	  public WebElement editExpMonthOnCardInpu;
	  
	  @FindBy(xpath = "//select[@id='expirationYearInput']")
	  public WebElement editExpYearOnCardInput;
	  
	  @FindBy(xpath = "//input[@id='securityCodeInput']")
	  public WebElement editSecCodeonCard;
	  
	  @FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	  public WebElement updateCardButton;
	  
	  @FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	  public WebElement updateCardSuccessMessage;
	  
	  @FindBy(xpath = "//button[contains(text(),'remove')]")
	  public WebElement removeCardButton;

	@FindBy(xpath = "//div[@class='account__address-new']")
	public WebElement addAddressOption;

	@FindBy(xpath = "//select[@id='countryDropdown']")
	public WebElement country;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameField;

	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberField;

	@FindBy(id = "streetInput")
	public WebElement streetAddressField;

	@FindBy(xpath = "//input[@id='apartmentInput']")
	public WebElement apartmentNumber;

	@FindBy(id = "cityInput")
	public WebElement cityField;

	@FindBy(xpath = "(//select[@class='account__address-new-dropdown'])[2]")
	public WebElement stateDropDown;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeField;

	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedSuccessfullyMessage;
	
	@FindBy(xpath = "//button[@class = 'account__address-btn' and text() = 'Edit']")
	public WebElement editAddressButton;
	
	@FindBy(xpath = "//button[@id='addressBtn']")
	public WebElement updateAddressButton;
	
	@FindBy(xpath = "//div[@class = 'account__address-single']")
	public WebElement alladdressesBox;
	
	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement updatedAddressSuccessMessage;
	
	@FindBy(xpath = "//button[@class = 'account__address-btn' and text() = 'Remove']")
	public WebElement removeAddressOption;
	

}
