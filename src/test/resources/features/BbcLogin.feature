Feature: Login
  As a BBC user I want to utilise the login feature
  So that I can use the customisation features

  Scenario: I receive a valid error when using an incorrect password
    Given I am on the signing page
    When I input a valid email
    And an invalid password
    Then I receive a valid error