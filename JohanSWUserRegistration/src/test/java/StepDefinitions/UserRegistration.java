package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class UserRegistration {
	WebDriver driver;

	@Given("Browser is open")
	public void browser_is_open() {
		// finds the chromedriver and runs it to open ChromeBrowser
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/johan_000/eclipse-workspace/JohanSW/src/test/resources/drivers/chromedriver.exe"); 
																												
		driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@And("User is on ChimpMail webpage")
	public void user_is_on_chimp_mail_webpage() {

		// navigates to mailchimp.com
		driver.get("http://mailchimp.com/"); 

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@When("user click on create an account")
	public void user_click_on_create_an_account() {

		// finds "Sign Up Free" button and click on it
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a")).click(); 
		
	}

	@And("User add {string} and {string} and {string}")
	public void user_add_eMail_and_Username_and_Password(String eMail, String Username, String Password) {

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// adds string value to the sign up boxes
		driver.findElement(By.id("email")).sendKeys(eMail);
		driver.findElement(By.id("new_username")).sendKeys(Username);
		driver.findElement(By.id("new_password")).sendKeys(Password);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Then("click on create account and user account is created")
	public void click_on_create_account_and_user_account_is_created() {

		driver.findElement(By.id("create-account")).click();
		
		assertEquals(true, driver.findElement(By.xpath("//*[@id=\"signup-content\"]/div/div/div/h1")).isDisplayed());
				

		System.out.println("Success");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.quit();

	}

}
