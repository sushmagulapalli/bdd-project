Feature: Login Feature

  Scenario: Successful login with valid credentials
    Given user launches the browser
    When user opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And clicks on login
    Then the page title should be "Dashboard / nopCommerce administration"
    And close the browser


    Scenario Outline:  Login Data Driven
      Given user launches the browser
      When user opens URL "https://admin-demo.nopcommerce.com/login"
      And user enters email as "<email>" and password as "<password>"
      And clicks on login
      Then the page title should be "Dashboard / nopCommerce administration"
      And close the browser
      Examples:
        | email               | password |  |
        | admin@yourstore.com | admin    |  |
        | admin@yourstore.com | admin123 |  |

