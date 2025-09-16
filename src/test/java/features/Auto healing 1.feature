Feature: Auto healing 11
#Regression Type
#Correct Values = true
#Incorrect Values = false
#Illegal Values = false
#Invalid Values = false
#Boundary Values = false
#Edge Cases Values = false

@Verify_the_options
@uid758093949
@set21
@test001
Scenario Outline: Verify the options
Given I have access to application
When I clicked Log in in demo web shop
And I clicked Register in demo web shop
And I clicked Shopping cart in demo web shop
And I clicked Wishlist in demo web shop
Then '<page>' is displayed with '<content>'

Examples:
|SlNo.|page|content|
|1|Demo Web Shop|NA|

#Total No. of Test Cases : 1

