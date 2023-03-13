
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'mohruniyozmamadova@gmail.com' and password 'Test12345!'
    And User click on login button
    And User should be logged in into Account
    
@updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Transformersm' and Phone '3475645996'
    And User click on Update button
    Then User profile information should be updated

@updatePassword
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Test12345!      | Mona1987!  | Mona1987!      |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

@addAddress
  Scenario: Verify User can add  an Address
    When User click on Account option
    And User click on  Add address option
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then Address message should be displayed 'Address Added Successfully'
