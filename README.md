# Payment Program

## Introduction
This project is a simple commercial application implemented using object-oriented inheritance concepts. In this program, customers can make payments using various methods such as credit card, PayPal, and Bitcoin.

## Project Structure
The project consists of the following sections:

### 1. Payment Strategies
This section includes an interface `PaymentStrategy` and three implementing classes:
- `CreditCardPayment`: Payment via credit card
- `PayPalPayment`: Payment via PayPal
- `BitcoinPayment`: Payment via Bitcoin

Each class contains the following methods:
- `pay(double amount)`: Processes a payment of a specified amount
- `getPaymentDetails()`: Retrieves payment details

### 2. Customers
This section includes an abstract class `Customer` and two subclasses:
- `RegularCustomer`: Regular customer
- `PremiumCustomer`: Premium customer

Each customer has the following attributes:
- `name`: Customer's name
- `paymentHistory`: List of payment transactions

And key methods:
- `makePayment(PaymentStrategy paymentStrategy, double amount)`: Processes payment using a specified strategy
- `showPaymentHistory()`: Displays the payment history

### 3. `Main` Class
In this section, three instances of customers are created, and transactions are conducted using different payment methods. The customer details are displayed accordingly.

## How to Run the Project
To run this project:
1. Ensure Java is installed.
2. Run the `Main` class.
3. Observe the output displayed.


