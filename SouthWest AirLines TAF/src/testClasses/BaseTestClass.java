package testClasses;

import baseClass.VerificationAndValidation;
import pageClasses.HomePage;
import utilities.AutoEmail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseTestClass {
	
	private static final Logger log = LogManager.getLogger(BaseTestClass.class.getName());
	WebDriver driver;
	HomePage homePage;
	String chromeDriverPath = "D:\\Selenium(June27)\\chromedriver_win32\\chromedriver.exe";
	String URL = "https://www.southwest.com";
	VerificationAndValidation v;
	SoftAssert soft;
	AutoEmail ae;

	@BeforeClass
	public void setUpClassLevel() {
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		log.info("Chrome Browser launched!!");
		homePage = new HomePage(driver);
		soft = new SoftAssert();
		v = new VerificationAndValidation(driver);
		ae = new AutoEmail();
		driver.manage().window().maximize();
		log.info("Browser window maximized!!");
		driver.manage().deleteAllCookies();
		log.info("Cookies deleted!!");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
		log.info("Browser Closed");
		ae.sendAutoMail("Nirvana");
	}
	
	@BeforeMethod
	public void setUpTestLevel(){
		driver.get(URL);
		log.info("Southwest airlines website opened");
	}

}
