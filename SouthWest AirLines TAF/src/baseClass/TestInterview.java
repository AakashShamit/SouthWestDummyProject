package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestInterview {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium(June27)\\chromedriver_win32\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver;
		String baseURL= "https://www.google.com/";
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		
		WebElement gSearchBar;
		WebElement gSearch1;
		gSearchBar = driver.findElement(By.name("q"));
		gSearchBar.sendKeys("Mindtree");
		gSearchBar.sendKeys(Keys.ENTER);
		System.out.println("Started");
		gSearch1 = driver.findElement(By.xpath("//div[@id='search']//h3[@class='r']/a"));
		String link = gSearch1.getAttribute("href");
		System.out.println(link);
		driver.quit();
		
		
		
		
	}
}
