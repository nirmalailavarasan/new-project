package com.jpet_app.steps;

import com.jpet_app.pages.jpet_app_printproducttable_pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jpet_app_printproducttable_steps {
	jpet_app_printproducttable_pages product = new jpet_app_printproducttable_pages();
	@Given("^Launch application home page for print product table$")
	public void launchapplicationforregister() {
		product.launchapplication();
	}

	@Then("^To select category$")
	public void selectcategoryprint() {
		product.selectcategorytoprint();
	}
	@Then ("^To check for print table$")
	public void printproducttable() {	
		product.printproducttable();
	}
	@And("^close browser for print$")
	public void close() {
		product.quit();
	}
	}




