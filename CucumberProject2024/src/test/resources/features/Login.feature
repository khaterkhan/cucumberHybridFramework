Feature: Login Functionality

Scenario: Login with valid credentials
Given User has navigated to login page
When User enters valid email address "Khater.khan1982@gmail.com" into email field
And User enters valid password "Ahamd2013!" into password field
And User clicks on login button
Then User should get Successfully logged in

Scenario: Login with invalid credentials
Given User has navigated to login page
When User enters invalid email address "iurwekds@gmail.com" into email field
And User enters invalid password "reeafsklfjk3!" into password field
And User clicks on login button
Then User should get Proper warning message about credential mismatch

Scenario: Login with valid email and invalid password
Given User has navigated to login page
When User enters valid email address "Khater.khan1982@gmail.com" into email field
And User enters invalid password "skfjsdkjf!" into password field
And User clicks on login button
Then User should get Proper warning message about credential mismatch

Scenario: Login with invalid email and valid password
Given User has navigated to login page
When User enters invalid email address "ijldskjfldsj@gmail.com" into email field
And User enters valid password "Ahamd2013!" into password field
And User clicks on login button
Then User should get Proper warning message about credential mismatch


Scenario: Login without providing any credentials
Given User has navigated to login page
When User dont enters email address into email field 
And User dont enters password into password field
And User clicks on login button
Then User should get Proper warning message about credential mismatch

