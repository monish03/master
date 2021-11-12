Feature: Login Feature File
@selenium
Scenario: Login scenario test for Facebook
Given navigate to Facebook page
When user logged in using username as 'monish' and password as 'abc123'
Then home page should be displayed


Scenario: Login scenario test for Facebook for blank credentials

When user logged in using username as '' and password as ''
Then home page should be displayed

Scenario: Login scenario test for Facebook invalid credentials

When user logged in using invalid username as 'ancsbjdn' and password as 'abc123'
Then home page should be displayed

Scenario Outline: Login scenario test for Facebook for multiple credentials

When user logged in using multple credentials username as  "<username>" and password as "<password>"
Then home page should be displayed
Examples:
|username|password|
|monish|abc123|
|amit|12345456|

Scenario: facebook browser close
Given clear all the browser


