package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	public WebDriver driver;// null Driver
	
//	@FindBy(xpath = "//span[text()='SHOP MEN']")
//	private WebElement shopMen;

	@FindBy(id = "desktop_profile")
	private WebElement loginHover;

	@FindBy(xpath = "//span[contains(text(), 'Login')]")
	private WebElement loginButton;

	@FindBy(id = "emph")
	private WebElement mobileNumberInput;

	@FindBy(xpath = "//input[@value='NEXT']")
	private WebElement submitButton;

	@FindBy(id = "otp")
	private WebElement otpInput;

	@FindBy(id = "modify_for_ctob")
	private WebElement verifyButton;
	
//	public WebElement getShopMen() {
//		return shopMen;
//	}

	public WebElement getLoginHover() {
		return loginHover;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getMobileNumberInput() {
		return mobileNumberInput;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getOtpInput() {
		return otpInput;
	}

	public WebElement getVerifyButton() {
		return verifyButton;
	}

	public LoginPOM(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
	}
}
