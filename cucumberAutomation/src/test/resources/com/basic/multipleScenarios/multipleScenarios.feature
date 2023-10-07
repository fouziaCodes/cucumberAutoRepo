Feature: 9 Create Account in Facebook
As a user I want to open facebook home page and create an account


Scenario: Validate First Name field 9-1
Given user is on facebook home page and clicks on Create Account
When user enters first name
Then user checks if user first name is present
Then close browser

Scenario: Validate create user multiple fields and password field is empty 9-2
Given user is on facebook home page and clicks on Create Account
When user enters first name 
And user enters last name
Then user checks if user first name is present
And user checks if user last name is present
And user verifies that mobile number field is blank
Then close browser