@OtherLogin @Regression
Feature: Validate Techfios Login functionality using scenario outline

Background:
	Given User is on the Techfios login page
	
@OtherScenario1
Scenario Outline: User should be able to login with valid credentials
	When User enters "<username>" and "<password>"
	And User clicks on SignIn button
	Then User should land on Dashboard page
	Examples:
	
	|username          | password   |
	|demo@techfios.com | abc123     |
	