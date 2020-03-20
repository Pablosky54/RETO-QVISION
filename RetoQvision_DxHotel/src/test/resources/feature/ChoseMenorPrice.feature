#Author: juan.gallon@upb.edu.co

Feature: Chose a most sheap trip
  She want chose a different option in web page

  
  Scenario: Carolina chose a most cheap option a trip
    Given "Carolina" open page
    When she chose options destination, Las Vegas and init "3/16/2020" until "3/20/2020"    
    Then she verify the total price is 360 

  