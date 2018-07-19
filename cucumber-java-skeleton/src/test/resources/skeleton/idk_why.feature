Feature: Git Hub Login Feature

Background:
Given The URL of Git Hub
@Regression
Scenario Outline: Login scenario
When User enters <username> as username
And User enters <password> as password
And User clicks on SignIn
Then User navigates to <result>

Examples: 
|username|password|result|
|pradhayiniburly|Git@123|Git Hub|
|pradhayiniburly|abcd|Sign In to Git Hub|