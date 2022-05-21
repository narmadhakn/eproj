package org.stepdef;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.pom.RegPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Define extends HelperClass {

	@Given("User should enter the meerkatkids homepage through gc browser")
	public void user_should_enter_the_meerkatkids_homepage_through_gc_browser() {
	    launchChromeBrowser();
	    geturl("https://www.meerkatkids.co.za/");
	    maxi();
	    waiting();
	}

	@When("user should Click Accesories Dropdown")
	public void user_should_Click_Accesories_Dropdown() {
		RegPojo r=new RegPojo();
		WebElement acc = r.getFname();
		btnclick(acc);
	    waiting();
	    waiting();
	}

	@When("under accesories click snoods link")
	public void under_accesories_click_snoods_link() {
		
		RegPojo r=new RegPojo();
		WebElement s = r.getLink();
		
	}

	@Then("check whether user is navigated to snoods page or not")
	public void check_whether_user_is_navigated_to_snoods_page_or_not() {
		
		String curr = getcurl();
		if (curr.contains("snoods")) {
			System.out.println("Snoods Page loaded successfully");
		} else {
			System.out.println("Snoods Page not loaded successfully");
		}
		
		
		
		
	  
	}
	
	
}
