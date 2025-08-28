# Currency Converter

A simple Java application to convert between all legal world currencies using static exchange rates.

## Features
- Supports all ISO 4217 legal tender currencies
- Converts any amount from one currency to another
- User input for amount, source currency, and target currency
- Easy to extend with real-time rates or additional features

## How to Run
1. **Compile the project:**
   - Open a terminal in the project directory
   - Run: `javac -d bin src/com/TheCodex/*.java`
2. **Run the converter:**
   - Run: `java -cp bin com.TheCodex.CurrencyConverter`
3. **Follow prompts:**
   - Enter the amount
   - Enter the source currency code (e.g., USD)
   - Enter the target currency code (e.g., INR)

## Example
```
Enter amount: 100
Enter FROM currency code (e.g., USD): EUR
Enter TO currency code (e.g., INR): INR
100.00 € = 9043.48 ₹
```

## Adding/Updating Exchange Rates
- Edit `CurrencyConverter.java` and update the `exchangeRates.put` values in the static block.
- Rates are relative to 1 USD.

## Extending
- Add real-time rates using an API
- Add a GUI or web interface
- Add historical rates or currency info

## License
MIT
