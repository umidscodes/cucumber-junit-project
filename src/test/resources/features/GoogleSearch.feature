Feature: Google search functionality
  Agile story: As a user, when i am on the google search page
  i should be able to search for anything and see relevant results.

  Scenario: Search page default title verification
    When user is on the google search page
    Then user should see titile is google