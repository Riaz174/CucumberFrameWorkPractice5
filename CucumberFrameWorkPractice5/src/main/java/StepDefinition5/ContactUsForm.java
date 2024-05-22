package StepDefinition5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Capstone.CucumberFrameWorkPractice5.feature;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
public class ContactUsForm {
	public WebDriver driver;
	@Before
	public void setup() {
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\CucumberFrameWorkPractice5\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://protrainingtech.com/");
		driver.manage().window().maximize();
	}
	@Given("^Already openend the protrainingtech\\.com$")
	public void already_openend_the_protrainingtech_com() throws Throwable {
	    String id = driver.getCurrentUrl();
	    System.out.println(id);
	    Assert.assertEquals(id, "https://protrainingtech.com/");
	    
	}

	@When("^User clicks the Contact link$")
	public void user_clicks_the_Contact_link() throws Throwable {
		Thread.sleep(3000);
	    feature ob = new feature(driver);
	    ob.contactLink();
	    
	}

	@Then("^User able to see Join us form$")
	public void user_able_to_see_Join_us_form() throws Throwable {
		Thread.sleep(6000);
		feature ob = new feature(driver);
		WebElement Course = ob.Joinus();
		 String CourseElementText = Course.getText();
		 System.out.println(CourseElementText);
	    
		
	    
	    
	}
	@When("^User enters the value for firstname \"([^\"]*)\"$")
	public void user_enters_the_value_for_firstname(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.fnameField(arg1);
	    
	   
	}

	@And("^User enters the value for lastname \"([^\"]*)\"$")
	public void user_enters_the_value_for_lastname(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.lnameField(arg1);
	    
	    
	}

	@And("^User enters the email \"([^\"]*)\"$")
	public void user_enters_the_email(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.emailField(arg1);
	
	    
	}

	@And("^User enters the phonenumber \"([^\"]*)\"$")
	public void user_enters_the_phonenumber(String arg1) throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.phoneField(arg1);
	    
	    
	}
	@When("^User clicks the Register button$")
	public void user_clicks_the_Register_button() throws Throwable {
		Thread.sleep(3000);
		feature ob = new feature(driver);
		ob.registerButton();
	   
	   
	}

	@Then("^User shall see confirmation message$")
	public void user_shall_see_confirmation_message() throws Throwable {
		Thread.sleep(10000);
		feature ob = new feature(driver);
		WebElement Confirm = ob.confirmationText();
		String dt =Confirm.getText();
		System.out.println(dt);
	  
	    
	}



}
