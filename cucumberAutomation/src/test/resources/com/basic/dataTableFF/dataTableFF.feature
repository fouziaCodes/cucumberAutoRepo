Feature: 3 Create Account in Facebook
As a user I want to open facebook home page and create an account

Background: Common Login Steps #runs for each scenario
Given user is on facebook home page and clicks on Create Account


#Scenario: Validate First Name field
#When user "David" enters first name
#Then user checks if user "David" first name is present
#Then close browser




Scenario: Validate create user multiple fields and password field is empty 3-1
When user enters following data
	|firstName	|lastName	|mobNum	|
	|Tom				|Hanks		|12354	|
	|Ryan				|Brown		|45452	|
Then close browser