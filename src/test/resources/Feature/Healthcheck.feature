@health
Feature: check basic functionality of application
Scenario: user is able to login, search product from hamberger menu and do add to cart

Given user launches application
And user sign in with "nighutmanish@gmail.com" and "ilovecs1.6"
And user opens hamberger menu and search product
And user selects the product from results page
When user clicks on buynow


@table
Scenario: check table
Given launch site
And Fetch price of nestle india