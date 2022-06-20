_# Currency Converter Application

## Description

This is a small application that converts a given amount from one currency to another currency. 

The application should take as an input:
* the _SOURCE_ currency: currency in which an amount is provided - see below
* the _TARGET_ currency: currency for which the amount is to be calculated
* the _AMOUNT_ to be converted: a numeric input (with decimals) representing the amount in _SOURCE_ currency to be converted to _TARGET_ currency

### Monetary data format

* monetary data value should have two decimal places using '.' as decimal separator;
* when applicable, rounding strategy should be to round to the nearest 0.01. _E.g., 0.8439 rounds to 0.84; 0.8459 rounds to 0.85._

### Currency conversion values

The application is initialized with a static set of currency conversion values which are used for the calculation:

| Source Currency | Target Currency | Conversion rate |
|-----------------|-----------------|-----------------|
| EUR             | GBP             | 0.85            |
| EUR             | USD             | 1.14            |
| GBP             | EUR             | 1.16            |
| GBP             | USD             | 1.34            |
| USD             | EUR             | 0.87            |
| USD             | GBP             | 0.74            |

## Testing data
Below you can find some conversion values that can be used for your testing.

| Source Currency | Target Currency | Amount in source currency | Converted amount |
|-----------------|-----------------|---------------------------|------------------|
| EUR             | GBP             | 100.0                     | 85.00            |
| EUR             | USD             | 31.11                     | 35.47            |
| GBP             | EUR             | 97.53                     | 113.13           |
| GBP             | USD             | 124.15                    | 166.36           |
| USD             | EUR             | 11                        | 9.57             |
| USD             | GBP             | 0.74                      | 0.55             |_