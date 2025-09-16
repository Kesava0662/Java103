package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class DemoWebShopStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
            @When("^I clicked Log in in demo web shop$")			
            public void whenIClickedLogInInDemoWebShop()
            {
                workFlow.clickedElement(0, "Demo Web Shop", "Demo Web Shop.LoginLinkXPATH", "XPATH");
                
            }
            @When("^I clicked Register in demo web shop$")			
            public void whenIClickedRegisterInDemoWebShop()
            {
                workFlow.clickedElement(0, "Demo Web Shop", "Demo Web Shop.RegisterLinkXPATH", "XPATH");
                
            }
            @When("^I clicked Shopping cart in demo web shop$")			
            public void whenIClickedShoppingCartInDemoWebShop()
            {
                workFlow.clickedElement(0, "Demo Web Shop", "Demo Web Shop.ShoppingcartLinkXPATH", "XPATH");
                
            }
            @When("^I clicked Wishlist in demo web shop$")			
            public void whenIClickedWishlistInDemoWebShop()
            {
                workFlow.clickedElement(0, "Demo Web Shop", "Demo Web Shop.WishlistLinkXPATH", "XPATH");
                
            }
             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void thenpageIsDisplayedWithcontent(String  varpage, String varcontent)
            {
                Assertion.isTrue(workFlow.verifyDefaultpageIsdisplayed(varpage), "Then '<page>' is displayed with '<content>'");
                Assertion.isTrue(workFlow.verifymessageIsDisplayed(varcontent), "");
                
            }
    }