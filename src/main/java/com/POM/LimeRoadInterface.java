package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface LimeRoadInterface {
	
	String shopMenI="//span[text()='SHOP MEN']";
	
	public static WebElement getShopMenI(WebDriver driver) {
		WebElement shopMen =driver.findElement(By.xpath(shopMenI));
		return shopMen;
	}

}
