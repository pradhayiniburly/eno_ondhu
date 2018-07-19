package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefs {
	WebDriver driver;
	
	@Given("^The URL of Git Hub$")
	public void the_URL_of_Git_Hub() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b8c.07.19\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
	}

	@When("^User enters (.*) as username$")
	public void user_enters_pradhayiniburly_as_username(String username) throws Throwable {
		driver.findElement(By.id("login_field")).sendKeys(username);
	}

	@When("^User enters (.*) as password$")
	public void user_enters_Git_as_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^User clicks on SignIn$")
	public void user_clicks_on_SignIn() throws Throwable {
		driver.findElement(By.name("commit")).click();
	}

	@Then("^User navigates to (.*)$")
	public void user_navigates_to_Git_Hub(String result) throws Throwable {
		if(result.startsWith("Sign"))
		{
			Assert.assertTrue(driver.getTitle().startsWith("Sign"));
		}
		else
		{
			Assert.assertTrue(driver.getTitle().startsWith("Git"));
		}		
		
	}
    }

