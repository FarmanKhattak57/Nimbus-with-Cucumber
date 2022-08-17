Feature: Login 

Background: Common Step 
Given user navigates to the website Nimbus
And There user logs in through Login Window by using companyname Username  Password
Scenario: Login Functionality

Then login must be successful.

Scenario: Logout Functionality 
 #Given user navigates to the website NimbusRms
 #And The user logsin through Loginscreen by using companyname Username  Password
 And click on logut Image
 And Click on Logut button
 Then url of New loging should be verified 