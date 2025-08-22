Feature: LoggedIn User View

  Scenario: Validate user is able to view after log in
    Given User navigates to the log in page
    When User successfully enters the log in details
    Then User should be able to view the product category page
    Then User navigates to the exclusive collection page
    Then User clicks on shoe name radio button
    Then User clicks on brown option from shoe color dropdown


