@Login
Feature: Login Page
	As a user I want a login page so that only valid users can have access
	
Background: 
	Given User is on the Techfios login page

Scenario: Users should be able to login with valid credentials
	When User enters username as "demo@techfios.com"
	When User enters password as "abc123"
	And  User clicks on SignIn button
	Then User should land on Dashboard page