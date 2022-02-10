Feature: autocomplete form

  @T1
  Scenario: fill in the address field
    Given I am on herokuapp.com
    When I insert some text in the address field
    Then I consider my test passed
