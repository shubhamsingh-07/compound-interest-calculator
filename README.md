# Compound Interest Calculator (Java)

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A console-based Java program that calculates the accumulated investment amount using a compound-interest formula. The user enters a principal amount, annual interest rate, compounding frequency, and investment duration.

## Formula

`A = P × (1 + r/n)^(n × t)`

Where:

- `P` is the initial principal.
- `r` is the annual interest rate expressed as a decimal.
- `n` is the number of compounding periods per year.
- `t` is the duration in years.
- `A` is the calculated final amount.

The program converts the percentage input to a decimal and uses `Math.pow()` to calculate the exponential term.

## Project Structure

```text
compound-interest-calculator/
├── MiniProject1.java
├── README.md
└── LICENSE
```

## Requirements

- JDK installed.
- A terminal or command prompt.

Verify your Java installation:

```bash
java -version
javac -version
```

## Compile and Run

From the project directory:

```bash
javac MiniProject1.java
java MiniProject1
```

Enter the principal, annual rate in percent, number of compounding periods per year, and number of years when prompted. The result is printed with two decimal places.

## Learning Outcomes

- Reading numeric input with `Scanner`.
- Converting a percentage to a decimal rate.
- Using `Math.pow()` for exponentiation.
- Formatting numeric results with `printf`.

## Limitations and Improvements

- Input validation is not implemented. Values such as zero compounding periods can cause invalid calculations.
- The program uses `double`; it is a learning exercise, not a financial or tax calculator.
- Add validation for negative values and zero compounding frequency.
- Consider `BigDecimal` and rounding rules if adapting the program for financial use.
- Add automated tests for known example values.

## License

Licensed under the MIT License. See [LICENSE](LICENSE) for the full text.
