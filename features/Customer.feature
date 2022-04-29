Feature: Customers

  Scenario: Add new Customer
    Given user Launch Chrome browser
    When user opens URL"https://admin-demo.nopcommerce.com/login"
    And  user enters Email as "admin@yourstore.com" and password as "admin"
    And click on Login
    Then user can view Dashboad
    When user click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message "The new customer has been added successfully"
    And close the browser
