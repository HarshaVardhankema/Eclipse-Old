Feature: Create Patient Accounts

  Scenario Outline: Midoc Patient Test
    Given User is the Login page of midoc Patient Web App 
    Then user enters the Email "<username>"
    Then User clicks on Continue Button
    Then Enter the First and Last Name 
    Then Select Gender
    Then Enter the Weight and Height 
    Then Enter the Date of Birth 
    And Enter the "<Mobile No>"
    Then Click on Continue button 
   Then Enters the OTP 
   Then Click on Continue Button 
   Then Click on Skip button 
   Then Enter Password and Confirm password
   Then Click on Continue button of Password
   Then Click on Sucess continue button 
   
   

  Examples:
    | username            |Mobile No |
    | Annos@gmail.com     |9088776789|
    | Hikii@gmail.com     |8077112345|
