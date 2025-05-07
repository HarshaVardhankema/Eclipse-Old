Feature: Login into midoc Doctor

# Without Examples Keyword 
 # Scenario: Midoc Doctor Test Scenario
 #   Given user already in the login page
 #       Then user enters "viggu@gmail.com" and "midoc123"
 #   Then user clicks on the login button
  #  Then the user is on the home page

  
  
  #With Example Keyword 
   Scenario Outline: Midoc Doctor Test Scenario
   
    Given user already in the login page
    Then user enters "<username>" and "<password>"
    Then user clicks on the login button
    Then the user is on the home page
    
    Examples:
    |username| password|
    |viggu@gmail.com|midoc123|
    |arron@gmail.com|midoc123|