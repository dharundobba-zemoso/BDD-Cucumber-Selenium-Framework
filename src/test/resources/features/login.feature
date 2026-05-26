@Smoke

Feature: Login Functionality

  Scenario Outline: Valid Login

    Given User launches SauceDemo website
    When User logs in with username "<username>" and password "<password>"
    Then Products page should display

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |