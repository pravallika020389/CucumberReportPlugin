Feature: login functionality

Background:
Given users opens salesforce application

Scenario: Login error message
	When user is on "LoginPage"
	And enter the username
	And clear the password
	And click on the loginbutton
	Then check for error message
	
Scenario: Login successful
	When user is on "LoginPage"
	And enter the username
	And enter the password
	And click on the loginbutton
	When user is on "HomePage"
	Then check for page title
	
Scenario: Login remember me
	When user is on "LoginPage"
	And enter the username
	And enter the password
	And check the remember me checkbox 
	And click on the loginbutton
	When user is on "HomePage"
	And click on user menu
	And select logout
	When user is on "reLoginPage"
	Then check the userid is saved
	
