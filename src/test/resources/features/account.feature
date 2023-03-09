Feature: Retail Account Page

  Background: 
    Given User is on tek retail website
    When User click on signIn button
    And User enters email "zafar@gmail.com" and password "Jafar22@"
    And User click on login button
    Then User should be logged in

  Scenario: Verify User can update Profile Information
    When user click on Account button
    When user update name 'Nectar' and Phone '3462125478'
    When user click on updateButton
    Then user profile information should be updated

  Scenario: Verify user an update password
    When user click on Account button
    And User enters below information
      | previousPassword | newPassword | confirmPassword |
      | Zafar22@         | Jafar22@    | Jafar22@        |
    And User click on Change password button
    Then a message shoud be displayed (Password Updated Successfully)


  Scenario: Verify User can add an Address
    When user click on Account button
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName  | phoneNumber | streetAddress | apt | city    | state   | zipCode |
      | Canada  | Zafar Ali |  3462125478 | 542 Ave H     |  38 | Houston | Alberta |   77469 |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’
