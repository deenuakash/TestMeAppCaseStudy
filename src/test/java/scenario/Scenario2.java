package scenario;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario2 {
	WebDriver d;
	@Given("User enters browser and provide TestMeApp URL")
	public void user_enters_browser_and_provide_TestMeApp_URL() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User enters the {string}")
	public void user_enters_the(String un) {
		d.findElement(By.name("userName")).sendKeys(un);
	}

	@When("User enters {string}")
	public void user_enters(String psd) {
		d.findElement(By.name("password")).sendKeys(psd);
	}

	@When("User clicks Login button")
	public void user_clicks_Login_button() {
		d.findElement(By.name("Login")).click();
	}

	@Then("User enters Home page")
	public void user_enters_Home_page() {
		Assert.assertTrue(d.getTitle().equals("Home"));
	}

}
