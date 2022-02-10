Feature: Search an address in openstreetmap.org

  @T3
  Scenario: search an address and press "Go"
    Given I am on openstreetmap.org
    When I insert some data in the text box
    And click on the Go button
    Then I should have results returned

    @T4
    Scenario: calculate the distance between two addresses
      Given I am on openstreetmap.org
      When I click route button
      And I insert some data in the text boxes
      And I click on the Go button
      Then I should see the distance and time needed

      @T5
      Scenario: calculate the distance between two addresses using all options available(bike, car & foot)
        Given I am on openstreetmap.org
        When I click route button
        And I insert some data in the text boxes
        And I select any option from the dropdown
        Then I should see the distance and time needed for each option