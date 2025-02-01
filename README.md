# SauceDemo-Automated-Testing

Project Overview:
The SauceDemo Test Automation project is a robust Selenium-based testing framework designed to ensure the seamless functionality of key e-commerce operations on the SauceDemo website. It automates and validates critical workflows, including user authentication, product selection, cart management, checkout, and logout, ensuring a smooth and error-free user experience.
Leveraging Java, Selenium WebDriver, TestNG, and Maven, the project enables efficient test execution, structured dependency management, and comprehensive validation through automated assertions. This ensures reliability, accuracy, and scalability in testing, making it a powerful solution for end-to-end web application automation

Technologies Used
•	Java – Programming language for writing test scripts.
•	Selenium WebDriver – For automating web interactions.
•	TestNG – For assertions, validation, and test case execution.
•	Maven – For managing dependencies and project build automation.
•	ChromeDriver – WebDriver implementation for Google Chrome.

Project Features
1.	Login Functionality Testing
•	Opens the SauceDemo login page.
•	Enters valid user credentials (standard_user / secret_sauce).
•	Asserts successful login by verifying the presence of the Products page.

3.	Product Selection and Cart Validation
•	Adds the Sauce Labs Backpack to the cart.
•	Navigates to the cart and verifies that the selected product is present.

5.	Checkout Process Automation
•	Proceeds to the checkout page.
•	Fills in customer details (First Name, Last Name, Postal Code).
•	Completes the purchase by clicking Finish.

7.	Order Confirmation Validation
•	Verifies the success message "Thank you for your order!" on the checkout complete page.

9.	Logout Functionality
•	Navigates to the menu and clicks on Logout.
•	Asserts that the login page is displayed again after logout.

11.	Browser Automation
•	Uses ChromeDriver to launch and interact with the website.
•	Implements basic delay handling (Thread.sleep, replaceable with WebDriverWait).

Expected Outcome
•	Ensures that the SauceDemo login, product selection, cart management, checkout flow, and logout functionality work correctly.
•	Automates end-to-end testing of an e-commerce workflow.
•	Validates successful transactions using TestNG assertions.
•	Uses Maven for managing dependencies and running test cases efficiently.
Future Enhancements
•	Implement WebDriverWait instead of Thread.sleep for better synchronization.
•	Integrate with JUnit/TestNG for test execution and reporting.
•	Parameterize test cases for multiple user roles and credentials.
