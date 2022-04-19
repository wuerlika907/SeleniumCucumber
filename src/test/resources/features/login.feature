@loginPage
Feature: User should be able to login


  Scenario: Login as driver
    Given  the user is on login page
    When  the user enters the driver information
    Then  the user should able to login

  Scenario: Login as a sales manager
    Given  the user is on login page
    When the user enters the sales manager information
    Then  the user should able to login

  Scenario: Login as a store manager
    Given  the user is on login page
    When the user enters the store manager information
    Then  the user should able to login
