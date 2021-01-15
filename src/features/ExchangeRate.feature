Feature: Need To test Foreign Exchange rates Application

In order to Check different Rest API for Foreign Exchnage rate application
As a user
I want to enter correct URL and inputs as API details 
And Get response with proper data and verifiy it.

Background:
          Given user Enterd url for Foreign exchange rates
                     
Scenario: In order to verify URL should be correct for Lstest Foreign Exchange rates 
          When user entered Valid Url for Latest Foreign exchange rates
          Then user connected getting correct responce
          
Scenario: In order to capture response for latest Foreign Exchanges with symbole or base parameter
          When user entered Correct API request details
          Then user getting exchanges rates details as responce
          
Scenario: In order to verify URL should be correct for Lstest Foreign Exchange rates 
          When user entered InValid Url for Latest Foreign exchange rates
          Then user Should Not allow to connected with URL and getting error in responce
          
Scenario: In order to verify REST API for Spefic date Foreign Exchange rates
          When user entered "Valid Url" with Specific date Foreign exchange rates
          Then user connected with WSDL and getting correct responce
          
Scenario: In order to capture response for specific date Foreign Exchanges with symbole or base parameter
          When user entered current date in Specific date Foreign exchange rates
          Then user getting exchanges rates details for current date as responce
          
Scenario: In order to capture response for specific date Foreign Exchanges with symbole or base parameter
          When user entered Future Date in Specific date Foreign exchange rates
          Then user getting current date exchanges rates details with validation message as responce
