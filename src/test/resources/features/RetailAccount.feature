@completeTest
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'mohruniyozmamadova@gmail.com' and password 'Zarrina1964!'
    And User click on login button
    And User should be logged in into Account

  @updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Mokhru' and Phone 'PhoneNumber'
    And User click on Update button
    Then User profile information should be updated

  @addPayment
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | fullName   |               6 |           2025 |          235 |
    And User click on Add your card button
    Then Card added message should be displayed 'Payment Method added sucessfully'

  @addAddress
  Scenario: Verify User can add  an Address
    When User click on Account option
    And User click on  Add address option
    And User fill new address form with below information
      | country | fullName | PhoneNumber | StreetAddress | apt | city | state | zipCode |
    And User click Add Your Address button
    Then Address message should be displayed 'Address Added Successfully'
