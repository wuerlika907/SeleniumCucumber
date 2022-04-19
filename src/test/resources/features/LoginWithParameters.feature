@LoginDifferentUser
Feature: Login with different user name

  Scenario: Login as driver
    Given the user logged in as "driver"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar Events - Activities"


  Scenario: login as a user
    Given  the user logged in as "usertype"
    Then  the user should able to login
    And the title contains "Dashboard"
