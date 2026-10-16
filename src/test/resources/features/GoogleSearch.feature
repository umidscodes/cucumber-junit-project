Feature: Google search functionality
  Agile story: As a user, when i am on the google search page
  i should be able to search for anything and see relevant results.

  Scenario: Search page default title verification
    When user is on the google search page
    Then user should see title is google

  @wip_umid
  Scenario: Search result title verification
    Given user is on the google search page
    When user searches for apple
    Then user should see apple in the title



