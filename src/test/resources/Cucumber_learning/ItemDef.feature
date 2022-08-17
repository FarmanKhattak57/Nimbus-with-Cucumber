Feature: Item Definition

Background: Common Step 
Given The user navigates to the website Nimbus
And The user logs in through Login Screen Window by using companyname Username  Password
  
Scenario:  Define New Item 
#Given user navigates to the website Nimbus
#And There user logs in through Login Window by using companyname Username  Password
When Open Item Definition Screen 
And Click on New button
And Enter data to define new item like lineitem code name costprice and retailprice
And clcik  on save button 
Then Verified New defined item 
And logout from nimbus 

Scenario: Update Newly defined Item 
When Open again Item Definition Screen
And Click on Edit button 
And Also click on update button 
Then Verfied udpated item 

Scenario: Delete Newly Defined Item 
When Open again Item Definition Screen for Item Deletion
And Click on Edit button for deletion 
And Also click on Delete button
Then Verfied Deleted item data

