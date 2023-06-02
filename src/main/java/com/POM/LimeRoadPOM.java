package com.POM;

import org.openqa.selenium.WebDriver;

public class LimeRoadPOM {
	
	public WebDriver driver;//null
	
	private LoginPOM login;
	private TshirtPOM tshirt;
	private JeansPOM jeans;
	private HomePOM home;
	

	public LoginPOM getLogin() {
		if(login==null) {
			login=new LoginPOM(driver);
		}
		return login;
	}
	public TshirtPOM getTshirt() {
		if(tshirt==null) {
			tshirt=new TshirtPOM(driver);
		}
		return tshirt;
	}
	public JeansPOM getJeans() {
		if(jeans==null) {
			jeans=new JeansPOM(driver);
		}
		return jeans;
	}
	public HomePOM getHome() {
		if(home==null) {
			home=new HomePOM(driver);
		}
		return home;
	}
	public LimeRoadPOM(WebDriver driver) {
		this.driver=driver;
	}
	   
}
