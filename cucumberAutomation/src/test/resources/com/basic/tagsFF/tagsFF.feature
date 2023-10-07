@login
Feature: 13 Create Account in Facebook
As a user I want to open facebook home page and create an account

@Smoke
Scenario: Validate First Name field1	13-1
Given user is on facebook home page and clicks on Create Account
When user "Mary" enters first name
Then user checks if user "Mary" first name is present
Then close browser

@Smoke @Regression
Scenario: Validate First Name field2 13-2
Given user is on facebook home page and clicks on Create Account
When user "Bailey" enters first name
Then user checks if user "Bailey" first name is present
Then close browser

@Sanity
Scenario: Validate First Name field3 13-3
Given user is on facebook home page and clicks on Create Account
When user "Ryan" enters first name
Then user checks if user "Ryan" first name is present
Then close browser

@Sanity @Regression	
Scenario: Validate First Name field4 13-4
Given user is on facebook home page and clicks on Create Account
When user "Bailey" enters first name
Then user checks if user "Bailey" first name is present
Then close browser

@Smoke
Scenario: Validate First Name field5 13-5
Given user is on facebook home page and clicks on Create Account
When user "Mary" enters first name
Then user checks if user "Mary" first name is present
Then close browser
