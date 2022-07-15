@F_LoginSauceDemo
Feature: This feature would be used to login into the application

  Background: Open the application
    Given I have opened SWAGLABS application in browser
	
	@Sanity
  Scenario Outline: Validate the successful login using multiple test data
    When I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the Login Button
    Then I should be landed on the products page

    Examples: 
      | UserName                | Password     |
      | standard_user           | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | problem_user            | secret_sauce |
	
	@Regression
  Scenario Outline: Validate the negative login using multiple test data
    When I enter username "<UserName>"
    And I enter password "<Password>"
    And I click on the Login Button
    Then I should be getting "<ErrorMsg>"

    Examples: 
      | UserName      | Password     | ErrorMsg                                                                  |
      | standard_user | secret_s     | Epic sadface: Username and password do not match any user in this service |
      | user          | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | user          | tomato_sauce | Epic sadface: Username and password do not match any user in this service |
