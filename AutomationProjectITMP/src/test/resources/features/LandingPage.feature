Feature: Validation on collabtools landing Page

  Scenario Outline: landingPage login validation -Invalid scenerio
    Given I navigate to the collabtool url
    And I enter a username "<username>"
    And I enter a valid password "<password>"
    And I click on the submit button
    Then a warning message is displayed "Invalid username or password."





    Examples:
      | username          | password         |
      | collaborationtool | 6BzbqpckbupVfrw  |
      | collaborationtol  | 6Bzbqp3ckbupVfrw |
      | collaborationtol  | 6BzbqpckbupVfrw  |