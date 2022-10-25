# Data Driven-Automation-Framework Validating Wikipedia Data
A sample framework based on Page Object Model, Selenium, TestNG using Java.This is sample of widely used POM framework in selenium using Java as scripting language. Maven is used for dependency management and continuous development. TestNG is used to maintain test cases

The framework uses:
Java,Selenium,TestNG,ExtentReport,Log4j.
# Installation (pre-requisites)
JDK 1.8+ (make sure Java class path is set)

Maven (make sure Maven_Home class path is set)

Add Required Dependency in pom.xml

Browser driver (make sure you have your desired browser driver and class path is set)
# Directory Structure
![26 10 2022_01 55 45_REC](https://user-images.githubusercontent.com/116420907/197879059-9ed28116-452d-499b-8932-2d3f24738013.png)
# POM
POM is a design pattern which is commonly used in Selenium for Automating the Test Cases
![26 10 2022_02 20 18_REC](https://user-images.githubusercontent.com/116420907/197879443-36e13165-2dbe-454e-a9e3-7153f3771220.png)
# Utility Class 
Utility class is a class that defines a set of methods that perform common, often re-used functions
![26 10 2022_02 24 17_REC](https://user-images.githubusercontent.com/116420907/197879973-b1caf144-dc62-407a-b5c1-fa3c59c49009.png)
![26 10 2022_02 25 38_REC](https://user-images.githubusercontent.com/116420907/197881878-692f3aec-0f62-4771-81fc-1e3e5a73a44b.png)

# Test Class
Test Class Can Contain Multiple Test Cases And We Are Using Testng Attribute Over There
![26 10 2022_02 28 39_REC](https://user-images.githubusercontent.com/116420907/197880713-b5c084ad-ed97-473c-b086-a1f84bae491e.png)
# Logs
A logging framework is a utility specifically designed to standardize the process of logging in your application.
![26 10 2022_02 30 45_REC](https://user-images.githubusercontent.com/116420907/197881089-6412ee18-caf2-40eb-910d-03800aff12a4.png)
# Reports
Once you ran your tests you can generate the various types of reports. This framework selenium-cucumber-java uses several different types of test reporters to communicate pass/failure.
![26 10 2022_02 32 24_REC](https://user-images.githubusercontent.com/116420907/197881683-a061813d-9ae0-4ba6-bba2-f94f63a3b93f.png)
# TestNg.xml
TestNG.xml file is a configuration file that helps in organizing our tests. It allows testers to create and handle multiple test classes, define test suites and tests. 
![26 10 2022_02 37 42_REC](https://user-images.githubusercontent.com/116420907/197882253-444f678c-e566-4b55-a4cc-438a08c0feb7.png)

# Instruction To Execute Test
We Can Trigger The Automation Manualy By Eclipse 
*Open Eclipse Goto testng.xml File Then Click Right Click 
*Select TestNG/JUnit Test

Or

We Can Trigger The Automation Using Jenkins
*Open Jenkins Select New Item
*Give Name Of The Item Select Maven Project
*Enter Description And Source Code Mannagement Select Git
*In Side Git Enter Url
*Then Move To Build Inside Root Pom Enter "pom.xml"
*In Goals And Options Enter "test"
*Select Build Now
