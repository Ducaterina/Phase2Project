@F_Products
Feature: This feature would be used to validate the prices of products

  Background: Open the application
    Given I have opened SWAGLABS application in browser

  @Sanity
  Scenario: Validate the prices of products on the product page
    When I have logged in successfully
    Then validate the prices of the products according to the table below
      | Sauce Labs Backpack               | $29.99 |
      | Sauce Labs Bike Light             | $9.99  |
      | Sauce Labs Bolt T-Shirt           | $15.99 |
      | Sauce Labs Fleece Jacket          | $49.99 |
      | Sauce Labs Onesie                 | $7.99  |
      | Test.allTheThings() T-Shirt (Red) | $15.99 |
