Feature: Registration on LambdataTest Website

 Background:
   Given I navigate to the form demo website

@regression @Outline
  Scenario: Valid form registration
#    Given I navigate to the form demo website
    When I enter my name
    And I enter a valid email address
    And I enter a valid password
    And I enter my company name
    And I enter my website URL
    And I select country from the dropdown list
    And I enter my city
    And I enter my address
    And I enter my second line of address
    And I enter my state
    And I enter my zip code
    And I click the submit button
    Then  the form is submitted successfully

@Outline
  Scenario Outline: Valid form registration
#    Given I navigate to the form demo website
    When I enter my name "<fullName>"
    And I enter a valid email address "<emailAddress>"
    And I enter a valid password  "<password>"
    And I enter my company name
    And I enter my website URL "<website>"
    And I select country from the dropdown list
    And I enter my city "<city>"
    And I enter my address
    And I enter my second line of address
    And I enter my state
    And I enter my zip code "<zipCode>"
    And I click the submit button
    Then  the form is submitted successfully
    Examples:
      | fullName    | emailAddress   | password    | website         | city       | zipCode |
      | Kay Smith   | kays@gmail.com | @jbdy012    | www.rcs56.co.uk | Manchester | M40 6PA   |
      | Jay Cat     | jayc@gmail.com | @12bysdy092 | www.rcs23.co.uk | London     | E16 3SA   |
      | Martins Lot | Mlot@gmail.com | @jbdy012    | www.rcs66.co.uk | Bolton     | BL1 6PA   |


  @invalid1
  Scenario: Valid form registration
#    Given I navigate to the form demo website
    When I omit my name
    And I enter a valid email address
    And I enter a valid password
    And I enter my company name
    And I enter my website URL
    And I select country from the dropdown list
    And I enter my city
    And I enter my address
    And I enter my second line of address
    And I enter my state
    And I enter my zip code
    And I click the submit button
    Then  an error message is displayed




@invalid
  Scenario: Valid form registration
#    Given I navigate to the form demo website
    When I enter my name
    And I enter an email address "hjnh"
    And I enter a valid password
    And I enter my company name
    And I enter my website URL
    And I select country from the dropdown list
    And I enter my city
    And I enter my address
    And I enter my second line of address
    And I enter my state
    And I enter my zip code
    And I click the submit button
    Then  an error message is displayed