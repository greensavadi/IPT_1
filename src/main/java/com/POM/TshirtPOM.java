package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPOM {

	public WebDriver driver;// null Driver

	@FindBy(id = "tshirt")
	private WebElement tshirt;

	@FindBy(xpath = "//div[contains(text(), 'Step Out In Style')]")
	private WebElement modelSelected;

	@FindBy(id = "18447257")
	private WebElement selectedItem;

	@FindBy(id = "size_29667730")
	private WebElement size;

	@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
	private WebElement addToCart;

	public WebElement getTshirt() {
		return tshirt;
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

	public TshirtPOM(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
	}
}
