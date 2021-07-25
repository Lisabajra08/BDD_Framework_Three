$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/lizba/eclipse-workspace/Selenium/BDD/src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page",
  "description": "As a user I want a login page so that only valid users can have access",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "login-page;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "a valid user",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user goes to Techfios website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Techfios website should display",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logins with valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Dashboard page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "username should match",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.a_valid_user()"
});
formatter.result({
  "duration": 165320900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_goes_to_Techfios_website()"
});
formatter.result({
  "duration": 3150522901,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.techfios_website_should_display()"
});
formatter.result({
  "duration": 51515300,
  "error_message": "org.junit.ComparisonFailure: Wrong Page expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat steps.LoginSteps.techfios_website_should_display(LoginSteps.java:34)\r\n\tat ✽.Then Techfios website should display(/Users/lizba/eclipse-workspace/Selenium/BDD/src/test/java/features/login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.user_logins_with_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.dashboard_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.username_should_match()"
});
formatter.result({
  "status": "skipped"
});
});