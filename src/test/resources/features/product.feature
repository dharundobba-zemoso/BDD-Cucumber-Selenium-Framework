@Regression

Feature: Product Purchase

  Scenario Outline: Add Product To Cart

    Given User launches SauceDemo website
    When User logs in with username "<username>" and password "<password>"
    And User adds "<product>" to cart
    Then Cart badge should display "1"

    Examples:
      | username      | password     | product                 |
      | standard_user | secret_sauce | Sauce Labs Backpack     |