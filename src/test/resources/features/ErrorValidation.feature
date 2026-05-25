@Negative

Feature: Invalid Login

  Scenario Outline: Invalid Credentials

    Given User launches SauceDemo website
    When User logs in with username "<username>" and password "<password>"
    Then Error message should display

    Examples:
      | username | password |
      | locked   | wrong123 |