Feature: CollabToolz dashboardAccess with different account types

  Scenario Outline: dashboard valid login
    Given I am on the landing page with login details "collaborationtool"  "6Bzbqp3ckbupVfrw"
    When I select the login button
    And I provide the credentials  "<accountType>" "<emailAddress>" "<password>"
    Then I am able to access the dashboard


    Examples:
      | accountType | emailAddress         | password     |
      | Student     | ajokepetra@gmail.com | #Omolola0    |
      | Recruiter   | andynetcs@gmail.com  | London12     |
      | Landlord    | jfashtest@gmail.com  | Password123! |


  Scenario Outline: Error validation on dashboard login page
    Given I am on the landing page with login details "collaborationtool"  "6Bzbqp3ckbupVfrw"
    When I select the login button
    And I provide the credentials  "<accountType>" "<emailAddress>" "<password>"
    Then a warning message pops up



    Examples:
      | accountType  | emailAddress             | password      |
#      | Recruiter    | andynetcswe@gmail.com    | London12      |
      | Landlord     | jfashtest@gmail.com      | Password1234! |
#      | Professional | kolasanmi2@sbe-ltd.co.uk | @Otunba01     |