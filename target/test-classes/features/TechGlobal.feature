Feature: TechGlobal Training Functionalities

  Scenario Outline: Validate Login Form
    Given user navigates to "https://techglobal-training.com/frontend"
    And user selects the "Login Form" option
    Then user should see "Login Form" heading
    When user enters username as "<username>" and password as "<password>"
    Then user should see a "<message>" message

    Examples:
      | username   | password | message                   |
      | johndoe    | 123456   | Invalid Username entered! |
      | tomsmith   | 12345    | Invalid Username entered! |
      | TechGlobal | Test1234 | You are logged in         |


  Scenario: Validate dynamic tables pop-up window
    Given user navigates to "https://techglobal-training.com/frontend"
    And user selects the "Frontend Testing" option
    And user selects the "Dynamic Tables" option
    Then user should see the "Dynamic Tables" heading
    When user clicks the "ADD PRODUCT" button
    Then validate Add New Product pop-up is displayed
    When user clicks the "CLOSE" button
    Then user should not see Add New Product pop-up


