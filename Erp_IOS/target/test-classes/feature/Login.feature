Feature: Login
  As a user
  I want to be able to log in with my email and password
  So that I can access my account

@InvalidEmailFormat
Scenario: Login-Invalid email format
  Given I am on the login page
  When I enter an invalid email format , password and click the login button
  Then I should see an error message "Invalid email format"

@MissingEmailOrPassword
Scenario: Login-Missing email or password
  Given I am on the login page
  When I leave the email field blank , enter a password and click the login button
  

@SuccessfulLogin
Scenario: Login- Successful login
  Given I am on the login page
  When I enter my valid email , password and click the login button
  Then I should be redirected to the dashboard