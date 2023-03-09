Feature: Sign In Feature and account creation

  Background: 
    Given User is on tek retail website
    When User click on signIn button
@test
  Scenario: Verify user can sign in into Retail Application
    And User enters email "zafar@gmail.com" and password "Jafar22@"
    And User click on login button
    Then User should be logged in

  
  Scenario Outline: Verify user can create and account into Retail Website
    When User click on CreateNewAccount button
    And User fill the signUp information with below data '<name>' '<email>' '<password>' '<confirmPassword>'
    And User click on SignUp button
    Then User should be logged into account page

    Examples: 
      | name         | email                 | password   | confirmPassword |
      | nakhtaraasd  | nakhtar23u1@gmail.com | Nakhtar2@@ | Nakhtar2@@      |
      | nakhtaraasd  | nakhtar2du1@gmail.com | Nakhtar2@@ | Nakhtar2@@      |
      | nakhtagraed  | nakhtar2cu1@gmail.com | Nakhtar2@@ | Nakhtar2@@      |
      | nakhtaraewsd | nakhtar2hu1@gmail.com | Nakhtar2@@ | Nakhtar2@@      |
