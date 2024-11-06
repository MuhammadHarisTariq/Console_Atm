# ATM System in Java

## Overview

This ATM System is a Java-based project designed to simulate basic banking operations, including balance checking, cash withdrawals, and cash deposits. The system allows users to interact with an ATM-like interface and perform actions like viewing their balance and making transactions.

## Features

- **Balance Checking**: View the current account balance.
- **Cash Withdrawal**: Withdraw money from the account, with validation for sufficient balance.
- **Cash Deposit**: Deposit money into the account to update the balance.
- **PIN Authentication**: Secure login using a PIN code to access the ATM system.

## Requirements

- Java 8 or higher
- A basic text editor or IDE (e.g., IntelliJ IDEA, Eclipse)

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/MuhammadHarisTariq/Console_Atm
```
### 2. Compile and Run the Program
- Open your terminal or command prompt.
- Navigate to the project directory.
- Compile the program:
```bash
javac ATM.java demo.java
```
- Run the program
```bash
java demo
```
### 3. Interact with the ATM
- Enter your PIN (default: 1234).
- Select an operation from the menu:
 
  Check balance

  Withdraw cash

  Deposit cash
  
  Exit the system
### How It Works
- Upon entering the correct PIN, the user is presented with an ATM menu offering options to check balance, withdraw cash, or deposit funds.

- The system performs necessary checks (e.g., withdrawal limits, sufficient balance) before proceeding with transactions.

- The program will continuously prompt the user with the menu until they choose to exit.
### Future Enhancements
- ATM Transaction History: Add the ability to view past transactions.
- Multiple Accounts: Support for managing multiple user accounts.
- Enhanced Security: Implement stronger security measures such as encryption for PIN storage.
## Conclusion

The ATM System project provides a simple simulation of basic banking operations, offering users the ability to check their balance, withdraw cash, and deposit funds securely with PIN authentication. This project helps demonstrate the practical application of object-oriented programming concepts in Java, including user input handling, conditional logic, and basic banking transactions.

By following the steps outlined in this README, users can easily set up and run the ATM System. The program can be further enhanced with additional features like transaction history, multi-user support, or graphical user interface (GUI) integration for an improved user experience.

Feel free to explore and modify the code to suit your learning goals or project requirements.
