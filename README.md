This is an API Automation Project

I Used (Java with Maven and Testng) / Intellij Community Edition
Allure for reports 
Run the commands: 
mvn clean test
mvn allure:serve

========================

Test Scenario as requested in the Assignment:
Create User using endpoint: POST https://reqres.in/api/users

Request body: 
{
    "name": "morpheus",
    "job": "leader"
}

========================

The response Returns 401 unauthorized 
{
    "error": "Missing API key"
}

The api should be Public and doesn't require any authentication

I even tried the register api and it also returns 401 
POST https://reqres.in/api/register

Tried them using postman also 

So when running the test, it won't return 201 as expected 
