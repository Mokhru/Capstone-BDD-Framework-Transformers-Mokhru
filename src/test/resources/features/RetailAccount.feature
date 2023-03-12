@addAddress
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'mohruniyozmamadova@gmail.com' and password 'Zarrina1964'
    And User click on login button
    And User should be logged in into Account

  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Transformers' and Phone '3475646996'
    And User click on Update button
    Then User profile information should be updated

	
  Scenario: Verify User can add  an Address
    When User click on Account option
    And User click on  Add address option
    And User fill new address form with below information
    |country|fullName|PhoneNumber|StreetAddress|apt|city|state|zipCode|
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'
