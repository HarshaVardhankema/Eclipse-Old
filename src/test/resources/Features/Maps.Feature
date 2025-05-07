Feature: Maps in Login Feature

Scenario: Maps in Login
    Given User is on the Login page of MiDoc Patient Web App
    Then user enters the Email 
        | username         |
        | palli@gmail.com |
    Then Click on Continue on Email 
    Then user enters the password
        | password  |
        | midoc123 |
    Then Click on Continue to the home page
