Feature: 2 Create Account in Facebook
As a user I want to open facebook home page and create an account


Scenario: Validate First Name field 2-1
Given user is on facebook home page and clicks on Create Account
When user "David" enters first name
Then user checks if user "David" first name is present
Then close browser

Scenario Outline: Validate create user multiple fields and password field is empty 2-2
Given user is on facebook home page and clicks on Create Account
When user "<firstName>" enters first name 
And user "<lastName>" enters last name
Then user checks if user "<firstName>" first name is present
And user checks if user "<lastName>" last name is present
And user verifies that mobile number field is blank
Then close browser
Examples: 
	|firstName	|lastName		|
	|Abby				|Brown			|
	|Bailey			|Cray				|
	|Chad				|Debra			|