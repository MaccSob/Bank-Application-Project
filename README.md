# 🏦 Bank-Application-Project

> A comprehensive, enterprise-ready banking system built in Java implementing the MVC architectural pattern, custom Exception Handling, and the Observer design pattern.

## 📌 About The Project
This project was developed as a final graduation application for my University degree. The primary objective was to build a secure, modular, and highly scalable banking core. Instead of monolithic scripting, the system utilizes advanced Software Engineering design patterns to decouple financial business logic from data modeling and user presentation, ensuring seamless maintainability.

## 🧱 Architectural Patterns & Design Choices
Based on the system's UML class diagram, the core architecture is governed by three primary pillars:

### 1. Model-View-Controller (MVC) Alignment
*   **Model:** Encapsulates core data structures including `BankAccount`, `SavingAccount`, `Owner`, and the central `Bank` ledger (managed via Java Collections `ArrayList`).
*   **View (`ViewInterface`):** Handles terminal outputs and user interaction, completely decoupled from the data layer.
*   **Controller (`BusinessLogic`):** Acts as the mediator, processing operations such as adding accounts, initiating transfers, and managing deposits/withdrawals.

### 2. Behavioral Patterns: Observer Design Pattern
The application implements an automated notification system under the `ObservePattern` module:
*   **`Observable` (Subject):** Tracks states and dispatches real-time broadcast events.
*   **`ObserverOffice` (Observer):** Abstract layer allowing concrete external entities to subscribe to banking state changes.
*   **`TaxOffice`:** A concrete observer implementation that automatically intercepts and generates audit reports (`raport()`) triggered by financial transactions.

### 3. Interface Separation & Custom Exception Architecture
*   **Interfaces (`Account`, `BankingOperations`):** Enforces a strict programming contract for structural financial events like `deposit()`, `withdraw()`, and `transferByAccountFromTo()`.
*   **Custom Exceptions:** Implements domain-specific error handling mechanisms including:
    *   `NoMoneyEx` (with built-in message tracking for insufficient funds).
    *   `NrAccountEx` (to trap and handle illegal account routing anomalies).

## 🛠️ Tech Stack
*   **Language:** Java (JDK 17+)
*   **Architecture:** Model-View-Controller (MVC)
*   **Design Patterns:** Observer Pattern
*   **Core Mechanics:** Java Collections Framework (`ArrayList`), Multi-level Inheritance, Interface Implementation, Custom Exception Handling

## 🌟 Key Features
*   👥 **Dynamic Account Injection:** Add new standard or saving accounts seamlessly to the active `ArrayList` tracking system.
*   💸 **Algorithmic Asset Transfer:** Secure transactional processing ensuring consistent data updates when shifting capital across account entities.
*   📊 **Autonomous External Reporting:** Real-time push notifications sent directly to the `TaxOffice` upon user deposits/withdrawals.
*   🛡️ **Defensive Fail-Safes:** Full prevention of application crashes thanks to a customized runtime exception bubble.

   ```

## 📈 Engineering Challenges & Key Learnings
*   **Decoupling with Patterns:** Gained practical, hands-on experience in decoupling backend software components using the Observer pattern. This prevents the core bank model from being tightly bound to regulatory report components like the `TaxOffice`.
*   **State Integrity during Exceptions:** Solved the challenge of rolling back or halting data state mutation within the `BusinessLogic` layer when a customized `NoMoneyEx` is triggered.
*   **Enterprise Architecture Prep:** Transitioned from writing simple procedural code to designing object-oriented, contract-driven codebases modeled directly after unified standard diagram parameters.






![Project One](https://github.com/MaccSob/Bank-Project/assets/99293752/84c82b17-1c2c-463e-9274-48e70176ad81)






Visual representation made in  Visual Paradigm - how the whole application should work. 
