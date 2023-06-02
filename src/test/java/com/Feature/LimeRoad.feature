@RegressionTest
Feature: LimeRoad order

@login
Scenario: To login into the LimeRoad application
Given Launch the url "https://www.limeroad.com/"
When click the element to select shop men it navigate to men page
And user Hover curser on profile icon login option will be shown below
And user click the login button to navigate to login page
And user enter login credintials as their mobile number
And user click next button to receive the opt in thier mobile
And user enter the otp in console as a input
Then user click verify button if Otp matches user will succesfully login into the limeroad application

@tshirt
Scenario: To search a product in Tshirt
When user navigate to the url "https://www.limeroad.com/"
And user click Tshirt icon to get all collection of tshirts
And user click required product model as Step Out In Style from the all product model
And user click required product item as Maroon Solid T-Shirt from the all items displayed
And user click required size as M from the various option provided
And user click add to cart button to save the item to the cart



@jeans
Scenario: To search a product in Jeans
When user navigate to the url "https://www.limeroad.com/"
And user click Jeans icon to get all collection of jeans
And user click required product model as Mid Rise Jeans from the all product model
And user click required product item as Mid Rise Washed Denim Jean from the all items displayed
And user click required size as 36 from the various option provided
And user click add to cart button to save the item to the cart


@home
Scenario: To search a product in Home
When user navigate to the url "https://www.limeroad.com/"
And user click Home icon to get all collection of home
And user click required product model as New and Wow from the all product model
And user click required product item as Microfiber Multipurpose Runner from the all items displayed
And user click add to cart button to save the item to the cart
Then user close the browser to exit the current scenario









