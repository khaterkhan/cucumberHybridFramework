Feature: Search Functionality

Scenario: User searches for a valid product
Given User opens the Application
When User enters valid products "HP" into Search box field
And User clicks on search button
Then User Should get valid product display in search result

Scenario: User searches for an invalid product
Given User opens the Application
When User enters invalid products "Honda" into Search box field
And User clicks on search button
Then User Should get a message about no product matching

Scenario: User searches wihthout any product
Given User opens the Application
When User dont  enters any products name into Search box field
And User clicks on search button
Then User Should get valid product display in search result
