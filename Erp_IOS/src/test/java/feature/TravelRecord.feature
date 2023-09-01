Feature: Travel Record Creation
  As a traveler
  I want to create a travel record
  So that I can keep track of my travel details

@withoutStartAndEndDate
Scenario: TravelRecordCreation-Create a new travel record without start date and end date
    Given I am a registered user
    When I create a new travel record
    Then the error should appear
@DefaultValues 
Scenario: TravelRecordCreation-In Create a new travel definition of day and alter Threshold Days
    Given I am a registered user
    When I create a new travel record
    Then Definition of day and alter Threshold Days must be present by default
@SameCountryInFromAndTo  
 Scenario: TravelRecordCreation-Create a new travel record for same country in from and to country
    Given I am a registered user
    When I create a new travel record enter same country in from and to country
    Then the error message shown
    
@12mothsDifferenceBetweenTaxYears  
Scenario: TravelRecordCreation-Create a new travel record without twelve months Difference Between Tax Years
    Given I am a registered user
    When I create a new travel record without twelve months Difference Between Tax Years
    Then Error message showing difference should be twelve years.
    