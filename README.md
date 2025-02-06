# Automation-Exercise-Katalon

This repository contains automated test scripts for the [Automation Exercise](https://www.automationexercise.com/) website using Katalon Studio. The tests are designed to verify the core functionalities of the site, including page navigation, product interactions, and user workflows. The scripts use Katalon’s built-in Web UI testing capabilities to ensure that the website performs as expected.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Reporting](#reporting)
- [Folder Structure](#folder-structure)
- [License](#license)

## Prerequisites

Before running the tests, make sure you have the following installed:
- [Katalon Studio](https://www.katalon.com/)
- Java Development Kit (JDK) 8 or higher
- Git (for cloning the repository)

## Installation
To get started with the automation test suite, follow these steps:

1. Install Git:
   Ensure Git is installed on your local machine. You can download it from git-scm.com and follow the installation instructions for your operating system.

2. Find the HTTPS URL of the Repository:
   Navigate to the repository you want to clone, look for a "Clone" or "Download" button, and select the HTTPS URL

3. Clone the Repository:
   ```sh
   git clone https://github.com/widhiputri/Automation-Exercise-Katalon.git

4. Import the Project into Katalon Studio
   - Open Katalon Studio.
   - From the File menu, select Import -> General -> Existing Projects into Workspace.
   - Browse and select the folder where you cloned this repository.
  
5. Run the Test Cases
   To execute the test cases:
   - Open the desired test case.
   - Click on the Run button to start the execution.
   - You can also execute the entire test suite if you want to run all tests.

## Reporting
Katalon provides detailed execution reports. Once a test case or suite is executed, you can view the reports in the Reports tab in Katalon Studio. These reports contain information about each test step, pass/fail status, and logs.

## Folder Structure
   The project structure is as follows:
   ```go
   Automation-Exercise-Katalon/
   ├── Object Repository/
   │   └── HomePage/
   │       └── buttonContactUs
   │       └── buttonMenuProducts
   │   └── Product/
   │       └── buttonAddToCart
   ├── Test Cases/
   │   └── Contact_Us/
   │       └── TC08_SubmitContactUsForm
   │   └── Product_Management/
   │       └── TC09_ViewProductsWithoutLogin
   │       └── TC11_SearchProduct
   │       └── TC12_AddProductsInCart
   │   └── User_Login/
   │       └── TC04_LoginWithValidCredentials
   │       └── TC05_LoginWithInvalidEmail
   │       └── TC06_LoginWithInvalidPassword
   ├── Test Suites/
   │   └── UserManagement
   ├── Reports/
   │   └── (Generated reports after test execution)
   └── Profiles/
       └── default
   ````
  
## License
   This project is open-source and available under the MIT License.
   ```yaml
   This README covers essential information for setting up, running tests, and understanding the structure of the repository.
   ```
