package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ExchangeRateStepDef {
	public static Response response;
	@Given("^user Enterd url for Foreign exchange rates$")
	public void user_Enterd_url_for_Foreign_exchange_rates() throws Throwable {
		 RestAssured.baseURI="https://api.ratesapi.io/";    
	      System.out.println("WSDL URL Entered");
	    
	}

	@When("^user entered Valid Url for Latest Foreign exchange rates$")
	public void user_entered_Valid_Url_for_Latest_Foreign_exchange_rates() throws Throwable {
		response =RestAssured.given().get("api/latest");
	   
	}

	@Then("^user connected getting correct responce$")
	public void user_connected_getting_correct_responce() throws Throwable {
		String res = response.asString();
		if(res.contains("base"))
		{System.out.println("User Entered URL is correct" );
		}
		else {
	    System.out.println("Invalid url");}
	}

	@When("^user entered Correct API request details$")
	public void user_entered_Correct_API_request_details() throws Throwable {
		response =RestAssured.given().get("api/latest?base=USD&symbols=GBP");
	   // throw new PendingException();
	}

	@Then("^user getting exchanges rates details as responce$")
	public void user_getting_exchanges_rates_details_as_responce() throws Throwable {
		String res = response.asString();

		System.out.println("Lates Exchange Rates as base USD is ");
		System.out.println(res);
	
    //throw new PendingException();
	   
	}

	@When("^user entered InValid Url for Latest Foreign exchange rates$")
	public void user_entered_InValid_Url_for_Latest_Foreign_exchange_rates() throws Throwable {
		response =RestAssured.given().get("api/latest?base=USwD&symbols=GBrP");
	  //  throw new PendingException();
	}

	@Then("^user Should Not allow to connected with URL and getting error in responce$")
	public void user_Should_Not_allow_to_connected_with_URL_and_getting_error_in_responce() throws Throwable {
		String res = response.asString();
		
		System.out.println("User Entered Invalid URL Error- ");
		System.out.println(res);
	    //throw new PendingException();
	}

	@When("^user entered \"([^\"]*)\" with Specific date Foreign exchange rates$")
	public void user_entered_with_Specific_date_Foreign_exchange_rates(String arg1) throws Throwable {
		response =RestAssured.given().get("api/2020-01-12");
	    //throw new PendingException();
	}

	@Then("^user connected with WSDL and getting correct responce$")
	public void user_connected_with_WSDL_and_getting_correct_responce() throws Throwable {
		String dres = response.asString();
		
		System.out.println("Date Exchange Rates is");
		System.out.println(dres);
	    //throw new PendingException();
	}

	@When("^user entered current date in Specific date Foreign exchange rates$")
	public void user_entered_current_date_in_Specific_date_Foreign_exchange_rates() throws Throwable {
		response =RestAssured.given().get("api/2021-01-15");
	//    throw new PendingException();
	}

	@Then("^user getting exchanges rates details for current date as responce$")
	public void user_getting_exchanges_rates_details_for_current_date_as_responce() throws Throwable {
		String Cdateres = response.asString();
		
		System.out.println("Date Exchange Rates for current date is");
		System.out.println(Cdateres);
	  //  throw new PendingException();
	}

	@When("^user entered Future Date in Specific date Foreign exchange rates$")
	public void user_entered_Future_Date_in_Specific_date_Foreign_exchange_rates() throws Throwable {
		response =RestAssured.given().get("api/2021-02-10");
	    //throw new PendingException();
	}

	@Then("^user getting current date exchanges rates details with validation message as responce$")
	public void user_getting_current_date_exchanges_rates_details_with_validation_message_as_responce() throws Throwable {
		String Fdateres = response.asString();
		
		System.out.println("Date Exchange Rates Future date is same as Current date");
		System.out.println(Fdateres);
	   // throw new PendingException();
	}

}
