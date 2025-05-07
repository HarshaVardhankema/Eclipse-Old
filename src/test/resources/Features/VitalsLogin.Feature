Feature: Vitals Login Feature

Scenario: Vitals in My Health

    Given User is on the Login page for Vitals in MiDoc Patient Web App
    Then user enters the Email 
        | palli@gmail.com |
    Then Click on Continue
    Then user enters the password
        | midoc123 |
    Then Click on Continue to home page
    Then user navigate to My Health Page
    Then user navigate to vitals
    And the user adds weight data
    And the user adds height data
    And the user adds respiratory data
    And the user adds body temperature data
    And the user adds oxygen level data
    And the user adds blood pressure data
    And the user adds heart pressure data
    
    
