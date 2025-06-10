Feature: Login on demo web
This feature file is created to test login functionality on the demo shop.

  Background:
    Given user opens the demo web shop page

@test2
Scenario:Login with valid credentials
      When user click on the login button on the top menu
      And user enters the username "omidtester@gamil.com"
      And user enters the password "Tester@2025"
      And user clicks on the login button
      Then user should be successfully logged in

  @test2
  Scenario Outline:Login with valid and invalid credentials
    When user click on the login button on the top menu
    And user enters the username "<user>"
    And user enters the password "<pass>"
    And user clicks on the login button
    Then user should be successfully logged in

    Examples:
    | user|  pass |
    |omidtester@gamil.com| Tester@2025|
    |omidtester@gamil.com| Tester@2024|
