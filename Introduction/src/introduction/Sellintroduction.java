package introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Sellintroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		// Chrome - ChromeDriver -->Methods
		//Firefox - FirefoxDrover -- Methods close get
		//Safari - SafariDriver --> Methods close get
		//Webdriver methods + class methods
		
		// Chromedriver.exe --> Chrome Browser
		// step to invoke chrome driver //
		//Selenium Manager
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documentos\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
