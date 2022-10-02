Feature: loginFeature
  this feaure deals with the login functionality of the applicationbyUIagainbyUIthird555
  this feaure deals with the login functionality of the applicationbylocalbranch
  Scenario: login with correct username with password
    Given I navigate to login page
    And  I entered username as "admin" and password as "pass"
    And  click on login button
    Then HomePage should be visible



  Scenario Outline: login with correct username with password (scenario outline)
    Given I navigate to login page
    And  entered username <username> and <password>
    And  click on login button
    Then HomePage should be visible

    Examples:
    |username|password|
    |AMLcontroller|password01|
