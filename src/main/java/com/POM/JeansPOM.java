package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JeansPOM {

	public WebDriver driver;// null Driver

	@FindBy(id = "menjeans")
	private WebElement menJeans;

	@FindBy(xpath = "(//div[contains(text(), 'Mid Rise Jeans')])[1]")
	private WebElement modelSelected;

	@FindBy(id = "19131757")
	private WebElement selectedItem;

	@FindBy(id = "size_31057713")
	private WebElement size;

	@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
	private WebElement addToCart;

	public WebElement getMenJeans() {
		return menJeans;
	}

	public WebElement getModelSelected() {
		return modelSelected;
	}

	public WebElement getSelectedItem() {
		return selectedItem;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public JeansPOM(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
	}

}
