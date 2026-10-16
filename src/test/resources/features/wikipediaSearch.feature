@Wikipedia
Feature: Wikipedia search functionality
  Agile story: as a user i should be able to search for Steve jobs
  in wikipedia and see all relevant information.

Scenario: Wikipedia search functionality title verification
  When user is on Wikipedia home page
  Then user types Steve Jobs in the search box
  Then user clicks wiki search button
  Then user should see Steve jobs in the wiki title