package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	private String HomePageURL = "https://www.southwest.com/";

	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1[@class='swa-header--logo-heading']")
	WebElement homePageLink;
			
	@FindBy(css = ".swa-header--link.swa-header--login.js-swa-header--login")
	WebElement LoginLink;
	
	//This element can't be accessed until Webelement LoginLink is clicked//
	@FindBy(id = "username")
	WebElement LoginUserName;
	
	//This element can't be accessed until Webelement LoginLink is clicked//
	@FindBy(name = "password")
	WebElement LoginPassword;
	
	//This element can't be accessed until Webelement LoginLink is clicked//
	@FindBy(id = "rememberme")
	WebElement LoginRememberMeCheckbox;
	
	//This element can't be accessed until Webelement LoginLink is clicked//
	@FindBy(id = "enrollNow")
	WebElement LoginEnrollNowLink;
	
	//This element can't be accessed until Webelement LoginLink is clicked//
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement Login_LoginButton;
	
	//This element can't be accessed until Webelement LoginLink is clicked//
	@FindBy(css = "a.swa-header--login-link.swa-header--login-label-link")
	WebElement LoginNeedHelpInLoggingIn;
	
	@FindBy(xpath = "//a[@class='swa-header--link']")
	WebElement EnrollLink;
	
	@FindBy(className = "js-swa-header--language-name")
	WebElement LanguageChangeButton;
	
	@FindBy(css = "span.swa-icon.swa-icon_global.swa-header--global-icon")
	WebElement LanguageChangeSymbol;
	
	@FindBy(xpath = "//button[@id='swa-header-link--plan-a-trip']")
	WebElement FlightHotelCarVacationButton;
	
	@FindBy(xpath = "//button[@id='swa-header-link--special-offers']")
	WebElement SpecialOffersButton;
	
	@FindBy(id="swa-header-link--rapid-rewards")
	WebElement RapidRewardsButton;
	
	@FindBy(xpath = "//span[@class = 'booking-form--menu-products-product-label' and contains(text(),'Flight')]")
	WebElement FlightBookingTab;
	
	@FindBy(xpath = "//span[@class = 'booking-form--menu-products-product-label' and contains(text(),'Hotel')]")
	WebElement HotelBookingTab;
	
	@FindBy(xpath = "//span[@class = 'booking-form--menu-products-product-label' and contains(text(),'Car')]")
	WebElement CarBookingTab;
	
	@FindBy(xpath = "//span[@class = 'booking-form--menu-products-product-label' and contains(text(),'Vacations')]")
	WebElement VacationTab;
	
	@FindBy(xpath = "//span[@class = 'booking-form--menu-products-product-label' and contains(text(),'CHECK IN')]")
	WebElement CheckinTab;
	
	
	@FindBy(xpath = "//span[@class = 'booking-form--menu-products-product-label' and contains(text(),'FLIGHT STATUS')]")
	WebElement FlightStatusTab;
	
	@FindBy(xpath = "//span[@class = 'booking-form--menu-products-product-label' and contains(text(),'CHANGE/CANCEL')]")
	WebElement ChangeOrCancelTab;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHomePageLink() {
		return homePageLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getLoginUserName() {
		return LoginUserName;
	}

	public WebElement getLoginPassword() {
		return LoginPassword;
	}

	public WebElement getLoginRememberMeCheckbox() {
		return LoginRememberMeCheckbox;
	}

	public WebElement getLoginEnrollNowLink() {
		return LoginEnrollNowLink;
	}

	public WebElement getLogin_LoginButton() {
		return Login_LoginButton;
	}

	public WebElement getLoginNeedHelpInLoggingIn() {
		return LoginNeedHelpInLoggingIn;
	}

	public WebElement getEnrollLink() {
		return EnrollLink;
	}

	public WebElement getLanguageChangeButton() {
		return LanguageChangeButton;
	}

	public WebElement getLanguageChangeSymbol() {
		return LanguageChangeSymbol;
	}

	public WebElement getFlightHotelCarVacationButton() {
		return FlightHotelCarVacationButton;
	}

	public WebElement getSpecialOffersButton() {
		return SpecialOffersButton;
	}

	public WebElement getRapidRewardsButton() {
		return RapidRewardsButton;
	}

	public WebElement getFlightBookingTab() {
		return FlightBookingTab;
	}

	public WebElement getHotelBookingTab() {
		return HotelBookingTab;
	}

	public WebElement getCarBookingTab() {
		return CarBookingTab;
	}

	public WebElement getVacationTab() {
		return VacationTab;
	}

	public WebElement getCheckinTab() {
		return CheckinTab;
	}

	public WebElement getFlightStatusTab() {
		return FlightStatusTab;
	}

	public WebElement getChangeOrCancelTab() {
		return ChangeOrCancelTab;
	}
	
	public String getHomePageURL() {
		return HomePageURL;
	}	

	public void clickHomePage() {
		homePageLink.click();
		System.out.println("Done");
	}
	
	public void clickLoginLink() {
		LoginLink.click();
	}
	
	public void enterLoginUserName(String username) {
		LoginUserName.sendKeys(username);
	}
	
	public void enterLoginPassword(String password) {
		LoginPassword.sendKeys(password);
	}
	
	public void clickRememberMe(){
		LoginRememberMeCheckbox.click();
	}
	
	public void clickEnrollNow(){
		LoginEnrollNowLink.click();
	}
	
	public void clickLoginButton(){
		Login_LoginButton.click();
	}
	
	public void clickNeedHelpInLoggingInLink(){
		LoginNeedHelpInLoggingIn.click();
	}
	
	public void clickEnrollLink(){
		EnrollLink.click();
	}
	
	public void clickLanguageChangeButton(){
		LanguageChangeButton.click();
	}
	
	public void clickLanguageChangeSymbol(){
		LanguageChangeSymbol.click();
	}
	
	public void clickFlightHotelCarVacationButton(){
		FlightHotelCarVacationButton.click();
	}
	
	public void clickSpecialOffersButton(){
		SpecialOffersButton.click();
	}
	
	public void clickRapidRewardsButton(){
		RapidRewardsButton.click();
	}
	
	public void clickFlightBookingTab(){
		FlightBookingTab.click();
	}
	
	public void clickHotelBookingTab(){
		HotelBookingTab.click();
	}
	
	public void clickCarBookingTab(){
		CarBookingTab.click();
	}
	
	public void clickVacationTab(){
		VacationTab.click();
	}
	
	public void clickCheckinTab(){
		CheckinTab.click();
	}
	
	public void clickFlightStatusTab(){
		FlightStatusTab.click();
	}
	
	public void clickChangeOrCancelTab(){
		ChangeOrCancelTab.click();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
