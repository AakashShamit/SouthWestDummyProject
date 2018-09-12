package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutSouthWestPage {

	WebDriver driver;
	private String AboutSouthWestPageURL = "https://www.southwest.com/html/about-southwest/index.html?clk=GFOOTER-ABOUT-ABOUT";

	public AboutSouthWestPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "h1[class = 'swa_page_title']")
	WebElement AboutSouthWestTitleText;

	public WebDriver getDriver() {
		return driver;
	}

	public String getAboutSouthWestPageURL() {
		return AboutSouthWestPageURL;
	}

	public WebElement getAboutSouthWestTitleText() {
		return AboutSouthWestTitleText;
	}

}
