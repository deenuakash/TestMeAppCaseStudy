package scenario;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario3 {
	WebDriver d;
	@Given("User enters browser and provide TestMeApp Url")
	public void user_enters_browser_and_provide_TestMeApp_Url() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String un) {
		d.findElement(By.name("userName")).sendKeys(un);
	}

	@When("User enters password {string}")
	public void user_enters_password(String psd) {
		d.findElement(By.name("password")).sendKeys(psd);
	}

	@When("User clicks Login")
	public void user_clicks_Login() {
		d.findElement(By.name("Login")).click();
	}

	@When("user types four characters in search field as {string}")
	public void user_types_four_characters_in_search_field_as(String string) {
		d.findElement(By.name("products")).sendKeys("bag");
	}

	@When("user verifies appropriate product is displayed")
	public void user_verifies_appropriate_product_is_displayed() throws InterruptedException {
	Thread.sleep(2000);
	    String s=d.findElement(By.id("itemscount")).getText();
	   int i=Integer.valueOf(s);
	    Assert.assertTrue(i>0);
	}

	@Then("user clicks search button")
	public void user_clicks_search_button() {
	    d.findElement(By.xpath("//*[@type='submit'][@value='FIND DETAILS']")).click();
	}
}
