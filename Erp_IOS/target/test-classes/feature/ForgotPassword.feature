Feature: ForgotPassword
  As a user
  I want to reset my password
  So that I can regain access to my account
@ForgotPasswordpage
  Scenario: ForgotPassword-User requests a password reset
    Given In the login page
    When I click on the Forgot Password link
    Then I should be redirected to the Forgot Password page
@sucessMessage
  Scenario: ForgotPassword-User submits a valid email for password reset
    Given I am on the password reset page
    When I enter my email Click on the Reset Password button
   
    
@invalidFormat
  Scenario: ForgotPassword-User submits an invalid email for password reset
    Given I am on the password reset page
    When I enter an invalid email invalidemail and click on the Reset Password button

@LoginPage
  Scenario: ForgotPassword-User updates the password successfully
    Given I am on the password update page
    When I enter a new password newpassword and confirm password and click update button
    Then I should see a success message indicating password update successful and redirected to the login page
  
