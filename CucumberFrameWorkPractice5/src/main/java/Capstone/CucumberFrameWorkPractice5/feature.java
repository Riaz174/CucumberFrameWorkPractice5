package Capstone.CucumberFrameWorkPractice5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class feature {
	static WebDriver driver;
	@FindBy(linkText = "Contact") WebElement Contactlink;
	@FindBy(xpath = "//*[text()='Join us !']") WebElement JoinusText;
	@FindBy(id = "form-field-name") WebElement fname;
	@FindBy(id = "form-field-field_6c5f814") WebElement lname;
	@FindBy(id = "form-field-email") WebElement emailField;
	@FindBy(id = "form-field-field_694d8a5") WebElement phoneField;
	@FindBy(xpath = "//*[text()='REGISTER']") WebElement registerButton;
	@FindBy(xpath = "//*[text()='The form was sent successfully.']") WebElement Confirmation;
	public feature(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void contactLink() {
		Contactlink.click();
	}
	public WebElement Joinus() {
		return JoinusText;
	}
	public void fnameField(String name) {
		fname.sendKeys(name);
	}
	public void lnameField(String name) {
		lname.sendKeys(name);
	}
	public void emailField(String email) {
		emailField.sendKeys(email);
		
	}
	public void phoneField(String phone) {
		phoneField.sendKeys(phone);
	}
	public void registerButton() {
		registerButton.click();
	}
	public WebElement confirmationText() {
		return Confirmation;
	}

}
