Feature: Login Feature

  @regression
  Scenario: Verify successful login user with valid credentials
    Given User is on the login page
    When User enters valid "tomsmith" and "SuperSecretPassword!"
    Then User should be redirected to the dashboard page


  @regression
  Scenario: Verify unsuccessful login with invalid password
    Given User is on the login page
    When User enters valid "tomsmith" and "test!"
    Then User should see an error message indicating invalid password



  @Sanity
  Scenario: Verify that user couldn't login when entered invalid username
    Given User is on the login page
    When User enters valid "test" and "SuperSecretPassword!"
    Then User should see an error message indicating invalid username



    Scenario Outline: Verify that user couldn't login when entered invalid credentials
      Given User is on the login page
      When User enters valid "<username>" and "<password>"
      Then user should see an error message
      Examples:
        | username | password|
        | tomsmith | test    |
        |test      | SuperSecretPassword!|
        |tomsmith  |                     |
        |          |SuperSecretPassword! |

