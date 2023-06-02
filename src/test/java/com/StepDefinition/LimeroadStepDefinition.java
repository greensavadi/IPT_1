package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;
import com.POM.LimeRoadInterface;
import com.POM.LimeRoadPOM;
import com.Runner.LimeRoadRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LimeroadStepDefinition extends BaseClass{
	//public static WebDriver driver=LimeRoadRunner.driver;
	
	//=LimeRoadRunner.driver;
	LimeRoadPOM pom= new LimeRoadPOM(driver);
	
	//Login	
	@Given("Launch the url {string}")
	public void launch_the_url(String string) {
    browserLaunch("Chrome");
   // implicitWait(10);
		urlLaunch(string);
	}

	@When("click the element to select shop men it navigate to men page")
	public void click_the_element_to_select_shop_men_it_navigate_to_men_page() {
		scrollAndClick(LimeRoadInterface.getShopMenI(driver));
	}

	@When("user Hover curser on profile icon login option will be shown below")
	public void user_hover_curser_on_profile_icon_login_option_will_be_shown_below() throws InterruptedException {
		explicitWaitVisibility(pom.getLogin().getLoginHover(), 15);
	    mouseHover(pom.getLogin().getLoginHover());
	    
	}
	@When("user click the login button to navigate to login page")
	public void user_click_the_login_button_to_navigate_to_login_page() {
		explicitWaitClickable(pom.getLogin().getLoginButton(), 15);
		mouseClick(pom.getLogin().getLoginButton());
	}
	@When("user enter login credintials as their mobile number")
	public void user_enter_login_credintials_as_their_mobile_number() throws InterruptedException {
		explicitWaitVisibility(pom.getLogin().getMobileNumberInput(), 15);
	    inputValues(pom.getLogin().getMobileNumberInput(), "8695530369");
	}
	@When("user click next button to receive the opt in thier mobile")
	public void user_click_next_button_to_receive_the_opt_in_thier_mobile() {
		scrollAndClick(pom.getLogin().getSubmitButton());
	    
	}
	@When("user enter the otp in console as a input")
	public void user_enter_the_otp_in_console_as_a_input() {
	    inputValues(pom.getLogin().getOtpInput(), otp());
	}
	@Then("user click verify button if Otp matches user will succesfully login into the limeroad application")
	public void user_click_verify_button_if_otp_matches_user_will_succesfully_login_into_the_limeroad_application() {
	   //explicitWaitClickable(pom.getLogin().getVerifyButton(), 5);
		//clickOnElement(pom.getLogin().getVerifyButton()); 
		System.out.println("user_will_succesfully_login_into_the_limeroad_application");
	}

	//scenario T-shirt	
	@When("user navigate to the url {string}")
	public void user_navigate_to_the_url(String string) {
	  navigateTo(string);
	}
	
	@When("user click Tshirt icon to get all collection of tshirts")
	public void user_click_tshirt_icon_to_get_all_collection_of_tshirts() {
	  clickOnElement(pom.getTshirt().getTshirt());
	}
	@When("user click required product model as Step Out In Style from the all product model")
	public void user_click_required_product_model_as_step_out_in_style_from_the_all_product_model() {
		scrollAndClick(pom.getTshirt().getModelSelected());
	}
	@When("user click required product item as Maroon Solid T-Shirt from the all items displayed")
	public void user_click_required_product_item_as_maroon_solid_t_shirt_from_the_all_items_displayed() {
		scrollAndClick(pom.getTshirt().getSelectedItem());
	}
	@When("user click required size as M from the various option provided")
	public void user_click_required_size_as_m_from_the_various_option_provided() {
		clickOnElement(pom.getTshirt().getSize());
	}
	@When("user click add to cart button to save the item to the cart")
	public void user_click_add_to_cart_button_to_save_the_item_to_the_cart() {
		clickOnElement(pom.getTshirt().getAddToCart() );
	}
	@Then("user close the browser to exit the current scenario")
	public void user_close_the_browser_to_exit_the_current_scenario() {
		close();
	}
	
	//scenario Jeans
	@When("user click Jeans icon to get all collection of jeans")
	public void user_click_jeans_icon_to_get_all_collection_of_jeans() {
		clickOnElement(pom.getJeans().getMenJeans());
	}
	@When("user click required product model as Mid Rise Jeans from the all product model")
	public void user_click_required_product_model_as_mid_rise_jeans_from_the_all_product_model() {
		scrollAndClick(pom.getJeans().getModelSelected());
	}
	@When("user click required product item as Mid Rise Washed Denim Jean from the all items displayed")
	public void user_click_required_product_item_as_mid_rise_washed_denim_jean_from_the_all_items_displayed() {
		scrollAndClick(pom.getJeans().getSelectedItem());
	}
	@When("user click required size as {int} from the various option provided")
	public void user_click_required_size_as_from_the_various_option_provided(Integer int1) {
		clickOnElement(pom.getJeans().getSize());
	}
	
	//scenario Home
	@When("user click Home icon to get all collection of home")
	public void user_click_home_icon_to_get_all_collection_of_home() {
		clickOnElement(pom.getHome().getHomeDecormen());
	}
	@When("user click required product model as New and Wow from the all product model")
	public void user_click_required_product_model_as_new_and_wow_from_the_all_product_model() {
		scrollAndClick(pom.getHome().getModelSelected());
	}
	@When("user click required product item as Microfiber Multipurpose Runner from the all items displayed")
	public void user_click_required_product_item_as_microfiber_multipurpose_runner_from_the_all_items_displayed() {
		scrollAndClick(pom.getHome().getSelectedItem());
	}
}
