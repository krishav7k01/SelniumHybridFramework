# Hybrid Selenium Test Automation Framework

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Selenium](https://img.shields.io/badge/Selenium-4.31.0-green.svg)
![TestNG](https://img.shields.io/badge/TestNG-7.11.0-yellow.svg)
![Jenkins](https://img.shields.io/badge/CI-Jenkins-blue.svg)
![License](https://img.shields.io/badge/license-MIT-brightgreen.svg)

## 🔍 Project Overview

This project is a Hybrid Test Automation Framework built using **Java**, **Selenium**, **TestNG**, **Apache POI**, **ExtentReports**, and **Jenkins**. It follows industry-standard design patterns and practices to support data-driven, modular, and maintainable UI test automation for web applications.

---

## 🚀 Features

- ✅ **Hybrid Framework Structure** combining Page Object Model and Utility layers
- 📊 **Data-Driven Testing** using Excel (Apache POI) and Java Faker for test data
- 📋 **Robust Reporting** with ExtentReports and detailed logging using Log4j2
- 🔁 **Retry mechanism** using custom TestNG retry analyzer
- 🤖 **CI/CD Integration** with Jenkins for automated test runs
- 🧪 **TestNG Suite Execution** for managing and grouping test cases
- 🖼️ **Screenshots** on test failures for easy debugging

---

## 📁 Project Structure
<img width="584" alt="Screenshot 2025-05-07 at 4 02 12 PM" src="https://github.com/user-attachments/assets/435c1e99-fa44-49bd-818a-124a40ee66be" />


## 🛠️ Tech Stack

- **Language**: Java 17
- **Build Tool**: Maven
- **Test Framework**: TestNG
- **Browser Automation**: Selenium WebDriver
- **Reporting**: ExtentReports 5, Log4j2
- **Data Management**: Apache POI, Java Faker
- **CI/CD**: Jenkins
- **Version Control**: Git + GitHub

---

## 🔧 Setup & Execution

### 📌 Prerequisites

- Java 17 installed
- Maven installed
- IDE (Eclipse or IntelliJ)
- ChromeDriver in PATH or `drivers/` folder
- Jenkins (optional, for CI)

### 📥 Clone the repository

```bash
git clone https://github.com/krishav7k01/SelniumHybridFramework.git
cd SelniumHybridFramework

📦 Run with Maven
mvn clean test
This executes the TestNG suite located at src/test/resources/testng.xml.

🧪 CI/CD with Jenkins
You can integrate this project with Jenkins using:

Maven build step: clean test

Trigger: Scheduled builds or Git webhook

Test reports and logs can be archived automatically

📄 Reports
HTML reports are generated using ExtentReports

Navigate to /reports/ folder to view results

Screenshots are saved under /screenshots/ on test failure



