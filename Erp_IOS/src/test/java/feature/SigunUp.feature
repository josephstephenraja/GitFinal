Feature: Signup Page
  As a user
  I want to sign up for an account
  So that I can access the system
  
  @InvaildMailID
  Scenario: Signup-Signup with invalid email
    Given I am on the sign-up page enter first name and last name.
     When I enter an invalid email
     Then I should see an error message about the invalid email
     @weakPassword
     Scenario: Signup-Signup with weak password
    Given I am on the sign-up page enter first name and last name.
    When I enter my email , Phone number and set weak pasword
    Then I should see an error message about the weak password
    
    @mismatch
    Scenario: Signup-Signup with password mismatch
    Given I am on the sign-up page enter first name and last name.
    When  I enter my email , Phone number, set password and confirm a different password
    Then I should see an error message about the password mismatch
    @SignUp
Scenario: Signup-Successful signup
    Given I am on the sign-up page enter first name and last name.
    When I enter my email , Phone number, set password, confirm password and click on check boxes the next button in consent form
    Then I should be redirected to the home page
    
