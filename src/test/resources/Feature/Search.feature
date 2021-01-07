Feature: Just dial Application

Scenario: user is able to signup in the application
Given user launches the url
And user clicks on signup button
When user enters the username
And user enters mobile number and clicks on send OTP
Then otp is sent
