package baseClass;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerificationAndValidation {

	WebDriver driver;
	private static final Logger log = LogManager.getLogger(VerificationAndValidation.class.getName());

	public VerificationAndValidation(WebDriver driver) {
		this.driver = driver;
	}

	public boolean vIsVisible(WebElement element){
		boolean result = element.isEnabled();
		if(result==true){
			System.out.println("Element "+element.getText()+" is displayed on Webpage");
			log.info(element.getText()+" displayed successfully on Webpage");
		}	
		else{
			System.out.println("Element "+element.getText()+" is not displayed on Webpage");

		}
		return result;
	}

	public boolean vIsEnabled(WebElement element){
		boolean result = element.isEnabled();
		if(result==true){
			System.out.println("Element "+element+" is enabled on Webpage");
		}
		else{
			System.out.println("Element "+element+" is not enabled on Webpage");
		}
		return result;
	}

	public boolean vIsDisabled(WebElement element){
		boolean result = element.isEnabled();
		if(result==true){
			System.out.println("Element "+element+" is not disabled on Webpage");
			return result;
		}
		else{
			System.out.println("Element "+element+" is disabled on Webpage");
			return result;
		}
	}

	public String elementGetText(WebElement element){
		String text = element.getText();
		if(text != null){
			System.out.println("Text of Element "+element+" - "+text);
			return text;
		}
		else{
			System.out.println("Text of Element "+element+" Not Found ");
			return null;
		}
	}

	public String getCurrentPageURL(WebDriver driver){
		String text = driver.getCurrentUrl();
		if(text != null){
			System.out.println("Current Page URL - "+text);
			return text;
		}
		else{
			System.out.println("Current Page URL Not Found");
			return null;
		}
	}	

	public String getCurrentPageTitle(WebElement element){
		String text = driver.getTitle();
		if(text != null){
			System.out.println("Current Page Title - "+text);
			return text;
		}
		else{
			System.out.println("Current Page Title Not Found");
			return null;
		}
	}






}
