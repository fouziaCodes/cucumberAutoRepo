Feature: 11 Create Account in Facebook
As a user I want to open facebook home page and create an account


Scenario: Validate First Name field 11-1
Given user is on facebook home page and clicks on Create Account
When user "David" enters first name
Then user checks if user "David" first name is present


Scenario: Validate create user multiple fields and password field is empty 11-2
Given user is on facebook home page and clicks on Create Account
When user "Ryan" enters first name 
And user "Brown" enters last name
Then user checks if user "Ryan" first name is present
And user checks if user "Brown" last name is present
And user verifies that mobile number field is blank