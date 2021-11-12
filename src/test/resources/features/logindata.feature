@loginpass
Feature: login to bank site 

Scenario Outline: verify login functionaltiy 
	Given user navigate to bank site 
	When user enter Username "<username>" 
	And user entered pass "<password>" 
	Then user succesfully logged in 
	
	Examples: 
		|username|password|
		|62207|mon03@|
		
Scenario: verify changepassword functionality
Given user navigate to changepassword
When user enter  old password
And user enters new password and confirm password
Then user succesfully change the password



Scenario: verify logout functionality
Given user navigates to logout functionality


