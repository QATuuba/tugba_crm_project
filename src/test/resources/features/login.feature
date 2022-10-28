@login
Feature:CRM application login feature
  Agile story: As a user, I should be able to login with correct credentials to different
  accounts. And Activity Stream page should be displayed.

  Accounts are: HR, Helpdesk, Marketing

  Background: For this scenarios in the feature file, user is expected to be on the login page
    Given user is on the login page

  @HR
  Scenario Outline: Login as HR user with Valid Credentials
    When user enters HR username "<HR username>"
    When user enters HR password "<HR password>"
    When user clicks the Log In Button
    Then user sees the Activity Stream page

    Examples:
      | HR username             | HR password |
      | hr1@cybertekschool.com  | UserUser    |
      | hr10@cybertekschool.com | UserUser    |
      | hr20@cybertekschool.com | UserUser    |
      | hr30@cybertekschool.com | UserUser    |
      | hr40@cybertekschool.com | UserUser    |
      | hr50@cybertekschool.com | UserUser    |
      | hr60@cybertekschool.com | UserUser    |
      | hr70@cybertekschool.com | UserUser    |
      | hr80@cybertekschool.com | UserUser    |
      | hr90@cybertekschool.com | UserUser    |

  @helpdesk
  Scenario Outline: Login as Helpdesk user with Valid Credentials
    When user enters helpdesk username "<Helpdesk username>"
    When user enters helpdesk password "<Helpdesk password>"
    When user clicks the Log In Button
    Then user sees the Activity Stream page

    Examples:
      | Helpdesk username             | Helpdesk password |
      | helpdesk1@cybertekschool.com  | UserUser          |
      | helpdesk10@cybertekschool.com | UserUser          |
      | helpdesk20@cybertekschool.com | UserUser          |
      | helpdesk30@cybertekschool.com | UserUser          |
      | helpdesk40@cybertekschool.com | UserUser          |
      | helpdesk50@cybertekschool.com | UserUser          |
      | helpdesk60@cybertekschool.com | UserUser          |
      | helpdesk70@cybertekschool.com | UserUser          |
      | helpdesk80@cybertekschool.com | UserUser          |
      | helpdesk90@cybertekschool.com | UserUser          |

  @marketing
  Scenario Outline: Login as Marketing user with Valid Credentials
    When user enters marketing username "<Marketing username>"
    When user enters marketing password "<Marketing password>"
    When user clicks the Log In Button
    Then user sees the Activity Stream page

    Examples:
      | Marketing username             | Marketing password |
      | marketing1@cybertekschool.com  | UserUser           |
      | marketing10@cybertekschool.com | UserUser           |
      | marketing20@cybertekschool.com | UserUser           |
      | marketing30@cybertekschool.com | UserUser           |
      | marketing40@cybertekschool.com | UserUser           |
      | marketing50@cybertekschool.com | UserUser           |
      | marketing60@cybertekschool.com | UserUser           |
      | marketing70@cybertekschool.com | UserUser           |
      | marketing80@cybertekschool.com | UserUser           |
      | marketing90@cybertekschool.com | UserUser           |


  @invalid
  Scenario Outline: User should not be able to login with invalid credentials
    When user enters invalid username  "<invalid username>"
    When user enters invalid password "<invalid password>"
    When user clicks the Log In Button
    Then user does not see the Activity Stream page

    Examples:
      | invalid username               | invalid password |
      | abc@cybertekschool.com         | UserUser         |
      | marketing10cybertekschool.com  | UserUser         |
      | @cybertekschool.com            | UserUser         |
      |                                | UserUser         |
      | hr1@cybertekschool.com         | userUser         |
      | helpdesk30@cybertekschool.com  | USERUSER         |
      | marketing80@cybertekschool.com | useruser         |
      | hr60@cybertekschool.com        | Useruser         |
      | marketing20@cybertekschool.com | xyz              |
      | helpdesk50@cybertekschool.com  |                  |