# OpenCart Automation Project

This repository contains the automation scripts for OpenCart using Selenium, Java, Maven, Docker, TestNG, and SonarQube. The goal of this project is to automate the testing of the OpenCart application to ensure its functionality and reliability.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [Running Tests](#running-tests)
- [Docker Integration](#docker-integration)
- [Continuous Integration](#continuous-integration)
- [Reporting](#reporting)
- [Contributing](#contributing)

## Project Overview

The OpenCart Automation Project is designed to automate the testing process of the OpenCart e-commerce platform. The project uses Selenium for browser automation, Java as the programming language, Maven for build automation, Docker for containerization, TestNG for test management, and SonarQube for code quality analysis.

## Features

- Automated end-to-end testing of OpenCart functionalities.
- Integration with Docker for containerized testing environments.
- Comprehensive test reporting with TestNG.
- Code quality analysis using SonarQube.

## Technologies Used

- **Selenium**: Browser automation tool.
- **Java**: Programming language for writing test scripts.
- **Maven**: Build automation tool.
- **Docker**: Containerization platform.
- **TestNG**: Testing framework for Java.
- **SonarQube**: Tool for continuous inspection of code quality.

## Setup Instructions

1. **Clone the repository**:
   ```bash
   git clone https://github.com/ArunM037/Opencart_Automation_Testing.git
   cd Opencart_Automation_Testing
   ````

## Install Dependencies

Ensure you have Java and Maven installed on your machine. You can install Maven using:

```bash
sudo apt-get install maven
Docker Setup 
````

Install Docker from Docker's official site.

SonarQube Setup
Install and configure SonarQube from SonarQube's official site.

Running Tests
To run the tests, use the following command:

bash
mvn clean test
Docker Integration
To run the tests inside a Docker container, use the following command:

bash
docker build -t opencart-automation .
docker run opencart-automation
Continuous Integration
Integrate with CI tools like Jenkins to automate the build and testing process.

Reporting
TestNG generates HTML reports that provide detailed information about the test execution.

Contributing
Contributions are welcome! Please fork the repository and submit pull requests for review.


