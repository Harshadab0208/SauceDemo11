Feature: Test Sauce Demo Application

  Scenario: validate login page Functionality
    Given user is at home page
    When user Enter Username and Password and click on login buttton
      | standard_user | secret_sauce |
    Then validate user is on Addtocart page
