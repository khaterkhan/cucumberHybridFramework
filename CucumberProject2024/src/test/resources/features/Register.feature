Feature: Registration Functionality

Scenario:  User creates an account  only with madatory fields
Given User naviagates to Register Account page
When User enters the details into below fields
|firstName	|Arun												|
|lastName	  |Motoori										|
|email			|amotoori2220@gmail.com			|
|telephone	|1342423432									|
|password 	|1234												|
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully


Scenario:  User creates a duplicate account  
Given User naviagates to Register Account page
When User enters the details into below fields

|firstName	|Arun												|
|lastName	  |Motoori										|
|email			|amotoori2220@gmail.com			|
|telephone	|1342423432									|
|password 	|1234												|
And User selects Yes for Newsletter
And User selects Privacy Policy
And User clicks on Continue button
Then User should get a proper warning about duplicate email

Scenario: User creates an account without filling any details
Given User naviagates to Register Account page
When User dont enter any details into fields
And User clicks on Continue button
Then User should get proper warning message about for every mandatory field 
