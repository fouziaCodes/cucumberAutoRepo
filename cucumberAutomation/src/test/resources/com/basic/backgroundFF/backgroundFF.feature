Feature: 1 Create Account in Facebook
As a user I want to open facebook home page and create an account

Background: Common Login Steps #runs for each scenario
Given user is on facebook home page and clicks on Create Account


Scenario: Validate First Name field 1-1
When user "David" enters first name
Then user checks if user "David" first name is present
Then close browser

Scenario: Validate create user multiple fields and password field is empty 1-2
When user "Ryan" enters first name 
And user "Brown" enters last name
Then user checks if user "Ryan" first name is present
And user checks if user "Brown" last name is present
And user verifies that mobile number field is blank
Then close browser  