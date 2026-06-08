# Bank Account Management Simulator
## Overview

The Bank Account Simulation System is a menu-driven Java application designed to simulate basic banking operations in a real-world environment. Users can create Savings and Current Accounts, perform deposits and withdrawals, transfer funds between accounts, check balances, and view transaction histories. The project leverages Object-Oriented Programming concepts such as inheritance, encapsulation, polymorphism, and method overriding to model different account behaviors. Additional features such as interest calculation for savings accounts and overdraft facilities for current accounts enhance the realism of the banking simulation.


## Objectives

* Simulate banking operations using Java.
* Apply OOP concepts such as Classes, Objects, Inheritance, Encapsulation, and Method Overriding.
* Maintain account balances and transaction history.
* Demonstrate real-world banking scenarios.

## Features

### Core Features

* Create Savings Account
* Create Current Account
* Deposit Money
* Withdraw Money
* Check Balance
* View Account Details
* View Transaction History

### Additional Features

* Transfer Money Between Accounts
* Savings Account Interest Calculation
* Current Account Overdraft Facility
* Transaction Logging
* Multiple Account Support
* Menu Driven Interface

## OOP Concepts Used

### Classes and Objects

* Account
* SavingsAccount
* CurrentAccount
* BankApp

### Inheritance

SavingsAccount and CurrentAccount inherit from Account.

### Method Overriding

The withdraw() method is overridden in:

* SavingsAccount
* CurrentAccount

### Encapsulation

Account data is stored within class objects and accessed through methods.

## Project Structure

BankAccountSimulation/

├── Account.java

├── SavingsAccount.java

├── CurrentAccount.java

└── BankApp.java

## Compilation

Compile all Java files:

javac *.java

## Execution

Run the main class:

java BankApp

## Sample Operations

1. Create Savings Account
2. Deposit ₹5000
3. Withdraw ₹1000
4. Transfer ₹500
5. Add Interest
6. View Transactions

## Learning Outcomes

* Understand Java OOP principles.
* Implement inheritance and method overriding.
* Simulate banking operations.
* Manage transaction history using ArrayList.
* Build menu-driven console applications.
