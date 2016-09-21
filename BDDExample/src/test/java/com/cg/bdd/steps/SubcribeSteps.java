package com.cg.bdd.steps;

import com.cg.bdd.SubscribeService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class SubcribeSteps {
	
	private String message;
	private SubscribeService subscribe;

	@Given("^I want to subscribe to important market information$")
	public void i_want_to_subscribe_to_important_market_information() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		subscribe = new SubscribeService();
	}

	@When("^I enter valid address (.*)$")
	public void i_enter_valid_address_saket_khandelwal_capgemini_com(String param) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		message = subscribe.subscribeToInfo(param);
	}

	@Then("^should I get a welcome message$")
	public void should_I_get_a_welcome_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("Required Welcome. Found " + message, message.contains("Welcome"));
	}

	@When("^I enter an invalid address (.*)$")
	public void i_enter_an_invalid_address_tsu_kth_se(String param) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		message = subscribe.subscribeToInfo(param);
	}

	@Then("^should I get an error message$")
	public void should_I_get_an_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue("Required Error. Found " + message, message.contains("Error"));
	}
}
