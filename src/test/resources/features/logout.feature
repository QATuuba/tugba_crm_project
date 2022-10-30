@logout
Feature: CRM application logout feature
  Agile Story: As a user, I should be able to log out,
  and "Log In" page should be displayed.

  Accounts are: HR, Helpdesk, Marketing

  Background: For this scenarios in the feature file, user is expected to be on the login page
    Given user is on the login page

  @ac1
  Scenario Outline: Log out and ends up on the login page
    When user enters username "<username>"
    When user enters password "<password>"
    When user clicks the Login Button
    When user sees Activity Stream page
    When user clicks the Log out button
    Then user should see Login page

    Examples:
      | username                       | password |
      | hr49@cybertekschool.com        | UserUser |
      | hr67@cybertekschool.com        | UserUser |
      | helpdesk16@cybertekschool.com  | UserUser |
      | helpdesk53@cybertekschool.com  | UserUser |
      | marketing78@cybertekschool.com | UserUser |
      | marketing34@cybertekschool.com | UserUser |

  @ac2
  Scenario Template: User can not go to the home page
  again by clicking the step back button after successfully logging out
    When user enters username "<username>"
    When user enters password "<password>"
    When user clicks the Log In Button
    When user sees Activity Stream page
    When user clicks the Log out button
    When user sees Login page
    When user clicks step back button
    Then user should not see Activity Stream page

    Examples:
      | username                       | password |
      | hr12@cybertekschool.com        | UserUser |
      | hr25@cybertekschool.com        | UserUser |
      | helpdesk38@cybertekschool.com  | UserUser |
      | helpdesk41@cybertekschool.com  | UserUser |
      | marketing54@cybertekschool.com | UserUser |
      | marketing69@cybertekschool.com | UserUser |

  @ac3
  Scenario Outline: User should be logged out if the user closes the open browsers
    When user enters username "<username>"
    When user enters password "<password>"
    When user clicks the Login Button
    When user sees Activity Stream page
    When user closes all open browsers
    When user is on the login page
    Then user should not see Activity Stream page


    Examples:
      | username                        | password |
      | hr73@cybertekschool.com         | UserUser |
      | hr86@cybertekschool.com         | UserUser |
      | helpdesk97@cybertekschool.com   | UserUser |
      | helpdesk100@cybertekschool.com  | UserUser |
      | marketing5@cybertekschool.com   | UserUser |
      | marketing101@cybertekschool.com | UserUser |