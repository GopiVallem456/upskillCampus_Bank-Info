Problem Statement: Client Bank Details Viewer
Background:
In today's digital age, clients expect easy access to their banking information. As a result, banks need to provide user-friendly applications that allow clients to view their account details conveniently. Your task is to develop a mobile application that enables clients to securely view their bank account details on their smartphones.
Requirements:
User Registration and Login:
Clients should be able to register for an account by providing their username and password.
Once registered, clients should be able to log in to their accounts using their credentials.
Bank Account Details:
After logging in, clients should be able to view their bank account details, including:
Bank name
Account number
Account holder's name
Account balance
Security:
Ensure that client data is securely stored and transmitted. Implement appropriate encryption techniques to protect sensitive information.
User Experience:

Design an intuitive user interface that provides a seamless experience for clients.
Ensure that the application is responsive and works well on various screen sizes and devices.
Offline Access:
Implement functionality to allow clients to view their bank account details even when offline. Any updates made offline should be synced with the server once the device is back online.
Error Handling:
Implement error handling mechanisms to gracefully handle scenarios such as network errors, server downtime, or invalid user input.
Testing:
Thoroughly test the application to ensure its functionality, usability, and security.
Conduct both manual and automated testing to identify and fix any bugs or issues.
Deliverables:
Mobile application source code written in a suitable programming language (e.g., Java for Android).
Documentation outlining the application architecture, design decisions, and instructions for setting up and running the application.
Test cases and test reports demonstrating the application's functionality and reliability.
Additional Information:
You may use any relevant libraries, frameworks, or tools to develop the application.
The application should comply with relevant security standards and best practices.
Consider the scalability and maintainability of the application for future updates and enhancements.



1	Existing and Proposed solution
1. Overview:
The Client Bank Details Viewer application is designed to provide clients with easy access to their bank account details on their smartphones. The application offers a secure and user-friendly interface for clients to register, log in, and view their account information.
2. Technology Stack:
Programming Language: Java for Android
Database: SQLite for local storage
Security: Encryption techniques for data protection
User Interface: Android XML layout files
Testing: Manual and automated testing using JUnit and Espresso
3. Features:
User Registration and Login:
Registration Form: Clients can register for an account by providing a username and password.
Login Screen: Registered clients can log in using their credentials.
Bank Account Details:
Dashboard: After logging in, clients are presented with a dashboard displaying their bank account details.
Account Information: The dashboard includes bank name, account number, account holder's name, and account balance.
Security Measures:
Data Encryption: Client data is securely encrypted to protect sensitive information.
Secure Transmission: Data transmission between the client application and server is encrypted using secure protocols.
User Experience:
Intuitive Interface: The application features a user-friendly interface designed for easy navigation and accessibility.
Responsive Design: The application is optimized for various screen sizes and devices to provide a seamless user experience.
