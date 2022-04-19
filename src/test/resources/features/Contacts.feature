@Contacts
Feature: Contacts page

  Scenario:Default page number
    Given the user is on login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1


  Scenario: Verify Create Calender Event
    Given the user is on login page
    And the user enters the sales manager information
    When the user navigates to Activities,Calender Events
    Then title should be Calender
   #added "s" at the end of calendar to fail
@wip
  Scenario: Menu Options Driver
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |
@wip
  Scenario: Menu Options Driver
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  Scenario Outline: login as a given user <user>
    Given the user is on login page
    When the user logs in using following credentials
    # under part we can use map key value
      | username  | <user>      |
      | password  | UserUser123 |
      | firstname | <firstname> |
      | lastname  | <lastname>  |
    Then the user should able to login
    #use key to pick up value
    #its list of map
    Examples:
      | user   | firstname | lastname |
      | user10 | John      | Doe      |