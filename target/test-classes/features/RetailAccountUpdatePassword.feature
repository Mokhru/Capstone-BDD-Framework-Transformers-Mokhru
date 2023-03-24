@completeTest
Feature: Retail Application Account Password Update Feature

  Scenario Outline: Verify User can Update password
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'mona87@test.com' and password '<previousPassword>'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option
    And User enter below information
      | previousPassword   | newPassword   | confirmPassword   |
      | <previousPassword> | <newPassword> | <confirmPassword> |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

    Examples: 
      | previousPassword | newPassword | confirmPassword |
      | Mona1987!        | Test12345!  | Test12345!      |
      | Test12345!       | Mona1987!   | Mona1987!       |
