Feature: User Signup Functionality
    @regression
  Scenario: User signs up successfully
    Given user open the browser 
    When user enter url  "https://www.demoblaze.com"
    And user click on Sign up
    And user enter username as  "Mamta_Dhiman" and password as "test13"
    And user  click on Sign up
    Then user is signup successfully and page title should be "STORE"
    And  close the browser
