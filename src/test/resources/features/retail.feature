Feature: This feature is use for testing UI of Retail page

  Scenario: Verify user can search a product
    Given User is on retail website
    When User search for "pokemon" product
    Then The product should be displayed
   
  Scenario: Verify Shop by Department sidebar
    Given User is on retail website
    When User click on all section
    Then below options are present in shop by department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |
