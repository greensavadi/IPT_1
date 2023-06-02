package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOM {

	public WebDriver driver;// null Driver

	@FindBy(id = "homedecormen")
	private WebElement homeDecormen;

	@FindBy(xpath = "//div[contains(text(), 'New And Wow')]")
	private WebElement modelSelected;

	@FindBy(id = "16568719")
	private WebElement selectedItem;

	@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
	private WebElement addToCart;

	public WebElement getHomeDecormen() {
		return homeDecormen;
	}

	public WebElement getModelSelected() {
		return modelSelected;
	}

	public WebElement getSelectedItem() {
		return selectedItem;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public HomePOM(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
	}
}
