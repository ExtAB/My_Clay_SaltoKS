@Login
Feature: Login test at SaltoKS

  @ValidUser
  Scenario: Create a valid user successfully
    Given I navigate to SaltoKS app
    When I enter my credentials, "<username>" and "<password>"
    And I navigate to settings page to fill username "John", lastname "Doe"
    Then I should verify successful message "<User created!>"