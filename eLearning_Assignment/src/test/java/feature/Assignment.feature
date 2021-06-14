Feature: Add an account in eLearning portal; send mail from this account and acknowledge mail sent to sender

Scenario: Create an account and Send mail with newly created account
Given Launch the eLearning portal
When User clicked signup button
And Create User and verify user created 
And Send Mail
Then Verify Acknowledge message