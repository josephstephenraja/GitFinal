Feature: Editing Travel Records
  As a user
  I want to be able to edit my travel records
  So that I can update the information as needed

@prefilled
  Scenario: EditingTravelRecords-default value prefilled
    Given I am logged in as a user and I have an existing travel record
    Then I should see the form pre-filled with start date, end date and tax year.

@NonEditable
  Scenario: EditingTravelRecords-Edit a Travel Record to view fields are not editable
    Then I should see start date, end date and tax year which are these fields are not editable
    
@ChangesUpdate
  Scenario: EditingTravelRecords-Edited changes needs to be reflected in travel list
    When I navigate to the edit travel record page make changes in travel type
    Then The updated changes needs to be reflected in travel record
    
    