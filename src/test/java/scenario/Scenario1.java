package scenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario1 {
	WebDriver d;
	@Given("User opens Browser and enters TestMeApp URL")
	public void user_opens_Browser_and_enters_TestMeApp_URL() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
	}
	@When("User enters username as {string}")
	public void user_enters_username_as(String un) {
	   d.findElement(By.name("userName")).sendKeys(un);
	}
	@When("User enters firstname as {string}")
	public void user_enters_firstname_as(String fn) {
		d.findElement(By.name("firstName")).sendKeys(fn);
	}
	@When("User enters lastame as {string}")
	public void user_enters_lastame_as(String ln) {
		d.findElement(By.name("lastName")).sendKeys(ln);
	}
	@When("User enters password as {string}")
	public void user_enters_password_as(String psd) {
		d.findElement(By.name("password")).sendKeys(psd);
	}
	@When("User enters confirm password as {string}")
	public void user_enters_confirm_password_as(String cpsd) {
		d.findElement(By.name("confirmPassword")).sendKeys(cpsd);
	}
	@When("User select gender  as {string}")
	public void user_select_gender_as(String gender) {
	    d.findElement(By.xpath("//input[@value='Male']")).click();
	}
	@When("User enters email as {string}")
	public void user_enters_email_as(String em) {
		d.findElement(By.name("emailAddress")).sendKeys(em);
	}
	@When("User enters mobile number as {string}")
	public void user_enters_mobile_number_as(String ph) {
		d.findElement(By.name("mobileNumber")).sendKeys(ph);
	}
	@When("User enters DOB as {string}")
	public void user_enters_DOB_as(String dob) {
		d.findElement(By.name("dob")).sendKeys(dob);
	}
	@When("User enters address as {string}")
	public void user_enters_address_as(String ad) {
		d.findElement(By.name("address")).sendKeys(ad);
	}
	@When("User select security question as {string}")
	public void user_select_security_question_as(String string) {
		Select s=new Select(d.findElement(By.name("securityQuestion")));
		s.selectByValue("411011");
	}
	@When("User enters answer as {string}")
	public void user_enters_answer_as(String ans) {
		d.findElement(By.name("answer")).sendKeys(ans);
	}
	@Then("User clicks register button")
	public void user_clicks_register_button() {
	  //  d.findElement(By.xpath("//*[@name='Submit'][@value='Rehister']")).click();
	}
}
