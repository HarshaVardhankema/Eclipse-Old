Feature: Login and Navigation

  Scenario: Successful login and navigating to Patients module
    Given the user is already logged in
    Given the user navigates to the Patients module
    When the user searches for a patient by name
    Then the user clicks on the Filter button to sort
    And the user clicks on the Three Dots option
