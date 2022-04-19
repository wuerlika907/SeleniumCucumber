@LoginAsSalesManager
Feature: Navigation Menu


  Scenario:navigating Fleet--Vehicles
    Given  the user is on login page
    And    the user enters the sales manager information
    When   the user navigate to Fleet,Vehicles
    Then   the title should be Vehicles

  Scenario: Navigating Marketing -Campaigns
    Given   the user is on login page
    And     the user enters the sales manager information
    When    the user navigate to Marketing,Campaigns
    Then    title should be Campaigns

  Scenario: Navigating Activities --Calender Events
    Given   the user is on login page
    And     the user enters the sales manager information
    Then    the user navigates to Activities,Calender Events
    Then    title should be Calender


