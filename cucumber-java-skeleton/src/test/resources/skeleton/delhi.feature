Feature: Login feature

Background:
Given The URL of Git Hub

Scenario: Valid Git Hub Login
When User enters pradhayiniburly as username
And User enters Git@123 as password
And User clicks on Submit
Then User navigates to Git Hub Page

Scenario: Invalid Git Hub Login
When User enters abc as username
And User enters 123 as password
And User clicks on Submit
Then User navigates to Sign In to Git Hub Page