package com.jpet_app.steps;

import java.io.IOException;

import org.junit.Assert;

import com.jpet_app.pages.jpet_app_searchforlink_and_searchforproduct_pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jpet_app_searchforlink_and_searchforproduct_steps {
jpet_app_searchforlink_and_searchforproduct_pages search = new jpet_app_searchforlink_and_searchforproduct_pages();
	
	@Given("^Launch application home page search options$")
	public void launchapplicationforregister() {
		search.launchapplication();
	}
	@Then("^To check for link$")
	public void checkforlink() {
		int b =search.Checkforlink();
		if(b>0)
		{
			System.out.println("The link is present");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("The link is not present");
			Assert.assertFalse(false);
		}
	}
	
	@Then("^to enter a product name$")
	public void typeaproduct() {
		search.type_a_product();
	}
	@Then("^To check for search$")
	public void search() throws IOException, InterruptedException {
		
		search.search();
		search.takescreenshot6("C:\\Users\\HP\\Desktop\\new project\\jpet_app\\src\\test\\resources\\screenshot\\search.png");
	}
	@And("^close browser for search$")
	public void close() {
		search.quit();
	}
}




