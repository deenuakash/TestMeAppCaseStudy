package scenario;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Scenario4 {
	WebDriver d;int c=0;
	@Given("User opens browser and enters url")
	public void user_opens_browser_and_enters_url() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    d=new ChromeDriver();
	    d.manage().window().maximize();
	    d.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User enters valid username as {string}")
	public void user_enters_valid_username_as(String un) {
		d.findElement(By.name("userName")).sendKeys(un);
	}

	@When("User enters valid password as {string}")
	public void user_enters_valid_password_as(String psd) {
		d.findElement(By.name("password")).sendKeys(psd);
		d.findElement(By.name("Login")).click();
	}

	@When("User searches for headphones in search field")
	public void user_searches_for_headphones_in_search_field() {
		d.findElement(By.name("products")).sendKeys("head");
		d.findElement(By.xpath("//*[@type='submit'][@value='FIND DETAILS']")).click();
	}

	@Then("User tries to proceed without clicking Add to Cart")
	public void user_tries_to_proceed_without_clicking_Add_to_Cart() throws InterruptedException {
		List<WebElement> links=d.findElements(By.tagName("a"));
		for(WebElement link : links)
		   {
			   System.out.println(link.getText());
		   }
		   for(WebElement link : links)
		   {
			   if(link.getText().equals("Add to cart"));{
			   		//Assert.assertTrue(false);
				   d.close();}
		   }
	}

	@When("User clicks Add to cart")
	public void user_clicks_Add_to_cart() {
		d.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("User clicks cart option")
	public void user_clicks_cart_option() {
		d.findElement(By.xpath("//*[@href='displayCart.htm']")).click();
	}

	@When("User clicks Checkout button")
	public void user_clicks_Checkout_button() {
		d.findElement(By.xpath("//*[@href='checkout.htm']")).click();
	}

	@When("User clicks proceed to pay button")
	public void user_clicks_proceed_to_pay_button() {
		d.findElement(By.xpath("//*[@value='Proceed to Pay'][@type='submit']")).click();
	}

	@When("User Selects bank options")
	public void user_Selects_bank_options() {
		 WebDriverWait wait=new WebDriverWait(d, 20);
		  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("/html/body/div/div/div/div/div[1]/h2"), "Welcome to Payment Gateway -"));
		  d.findElement(By.xpath("//label[contains(text(),'HDFC Bank')]")).click();
		  d.findElement(By.xpath("//a[@id='btn']")).click();
	}

	@When("User give Payment Username")
	public void user_give_Payment_Username() {
		d.findElement(By.name("username")).sendKeys("Lalitha");
	}

	@When("User give Payment Password")
	public void user_give_Payment_Password() {
		d.findElement(By.name("password")).sendKeys("Password123");
	}

	@Then("User clicks payment login")
	public void user_clicks_payment_login() {
		d.findElement(By.xpath("//input[@type='submit'][@value='LOGIN']")).click();
	}
}
