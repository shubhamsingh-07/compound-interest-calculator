**Compound Interest Calculator (Java)**








A simple and efficient Java console application that computes the future value of an investment using compound interest.
This project demonstrates user input handling, mathematical computation, formatted output, and clean Java fundamentals.

**Table of Contents**

Overview

Features

Architecture Diagram

Compound Interest Growth Diagram

Formula

Example Output

Project Structure

How to Run

Future Enhancements

License

**Overview**

This is a beginner-friendly Java mini-project that calculates the accumulated amount on a principal investment using the compound interest formula:

Accepts investment parameters interactively

Performs rapid interest calculations

Uses Math.pow() for exponential computation

Outputs the result in a clean, currency-formatted style

It is ideal for beginners learning Java fundamentals, CLI programs, and mathematical logic.

**Features**

Console-based interactive input

Well-structured variable usage

Compound interest calculation using exponential mathematics

Clean and properly formatted output using printf

Simple and extendable codebase

**Architecture Diagram**
## Architecture Diagram

```
┌───────────────────────────┐
│        User Input         │
│ (Principal, Rate, Years)  │
└───────────────┬───────────┘
                │
                ▼
┌───────────────────────────┐
│ Compound Interest Logic   │
│        (Math.pow)         │
└───────────────┬───────────┘
                │
                ▼
┌───────────────────────────┐
│       Final Output        │
│  (Formatted Amount Value) │
└───────────────────────────┘
```


**Compound Interest Growth Diagram**
## Compound Interest Growth Diagram

```
Principal
  │
  │           ***************
  │        ***               ****
  │      **                     ****
  │   ***                         *****
  │**************************************** Time →
```

**Formula**

The application uses the standard compound interest formula:

A = P * (1 + r/n)^(n * t)


Where:

P = Principal

r = Annual interest rate (decimal)

n = Number of compounding periods per year

t = Time in years

A = Final amount

Example Output
principal amount: 5000
the rate of interest (in %): 7
the # of times interest is compounded per year: 12
the # of years: 10
the amount after 10 years is $10,115.66

**Project Structure**
## Project Structure

```
/compound-interest-calculator
│── MiniProject1.java
│── README.md
│── .gitignore   (optional)
```


**How to Run**
1. Compile the program:
javac MiniProject1.java

2. Run it:
java MiniProject1

3. Clone from GitHub (if viewing as user):
git clone https://github.com/your-username/compound-interest-calculator.git

**Future Enhancements**

Add input validation

Add support for recurring monthly deposits (SIP model)

Build a GUI version (JavaFX / Swing)

Convert to OOP structure (InterestCalculator class)

Build a Spring Boot REST API

Add JUnit test cases

Add charts for growth visualization

**License**

This repository is licensed under the MIT License.
Free to use, modify, and distribute.
