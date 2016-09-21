Feature: Subscribe for Our email marketing service
	
	In order to be able to receive marketing messages 
	As marketing message receiver
	I should be able to register my e-mail address
	
	Scenario: Subscribe with a valid email address
		Given I want to subscribe to important market information
		When I enter valid address saket.khandelwal@capgemini.com
		Then should I get a welcome message
	
	Scenario: Try to subscribe with an invalid e-mail address
    	Given I want to subscribe to important market information
		When I enter an invalid address tsu.kth.se
    	Then should I get an error message