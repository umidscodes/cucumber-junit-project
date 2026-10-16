@regression
Feature: Library Log in feature.
  User story: As a user i should be able to login with correct credentials to different accounts,
  Accounts are: Librarian, Student, Admin.

  #How to comment on a feature file

  Background: For all scenarios the user will be on the login page of the library application
    Given user is on the login page of the application

  @librarian @smoke
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

    @student @smoke
    Scenario:  Login as student
      When user enters student username
      And user enters student password
      Then user should see the dashboard

      @admin
  Scenario:  Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard