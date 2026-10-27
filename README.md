# Compound Interest Calculator (Java)

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A console-based Java program that calculates the accumulated investment amount using a compound-interest formula. The user enters a principal amount, annual interest rate, compounding frequency, and investment duration.

## Formula

`A = P × (1 + r/n)^(n × t)`

Where `P` is principal, `r` is the annual interest rate as a decimal, `n` is compounding periods per year, `t` is time in years, and `A` is the final amount. The program converts the percentage input to a decimal and uses `Math.pow()`.

## Project Structure

```text
compound-interest-calculator/
├── MiniProject1.java
├── README.md
└── LICENSE
```

## Requirements

Install a JDK and ensure `java` and `javac` are available in your terminal.

## Compile and Run

```bash
javac MiniProject1.java
java MiniProject1
```

Enter the principal, annual rate in percent, number of compounding periods per year, and number of years when prompted. The result is printed with two decimal places.

## Learning Outcomes

- Reading numeric input with `Scanner`.
- Converting a percentage to a decimal rate.
- Using `Math.pow()` for exponentiation.
- Formatting results with `printf`.

## Limitations and Improvements

Input validation is not implemented. Zero compounding periods can cause invalid calculations, and negative values are not rejected. This is a learning exercise, not a financial or tax calculator. Potential improvements include validation, currency-safe arithmetic with `BigDecimal`, and automated tests.

## License

Licensed under the MIT License. See [LICENSE](LICENSE) for details.
