package com.TheCodex;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private static final Map<Currency, Double> exchangeRates = new HashMap<>();

    static {
    // ✅ Rates relative to 1 USD (for demo purposes)
    exchangeRates.put(Currency.USD, 1.0);
    exchangeRates.put(Currency.INR, 83.2);
    exchangeRates.put(Currency.EUR, 0.92);
    exchangeRates.put(Currency.GBP, 0.78);
    exchangeRates.put(Currency.JPY, 146.0);
    exchangeRates.put(Currency.AUD, 1.52);
    exchangeRates.put(Currency.CAD, 1.34);
    exchangeRates.put(Currency.CNY, 7.28);
    exchangeRates.put(Currency.CHF, 0.89);
    exchangeRates.put(Currency.RUB, 96.2);
    exchangeRates.put(Currency.BRL, 4.9);
    exchangeRates.put(Currency.ZAR, 18.3);
    exchangeRates.put(Currency.MXN, 16.8);
    exchangeRates.put(Currency.SGD, 1.36);
    exchangeRates.put(Currency.HKD, 7.82);
    exchangeRates.put(Currency.KRW, 1320.5);
    exchangeRates.put(Currency.AED, 3.67);
    exchangeRates.put(Currency.SAR, 3.75);
    exchangeRates.put(Currency.SEK, 10.6);
    exchangeRates.put(Currency.NOK, 10.4);
    exchangeRates.put(Currency.DKK, 6.87);
    exchangeRates.put(Currency.TRY, 27.0);

    // Add all other currencies with placeholder rate 1.0
    exchangeRates.put(Currency.BWP, 1.0);
    exchangeRates.put(Currency.LSL, 1.0);
    exchangeRates.put(Currency.NAD, 1.0);
    exchangeRates.put(Currency.SSP, 1.0);
    exchangeRates.put(Currency.ZWL, 1.0);
    exchangeRates.put(Currency.EGP, 1.0);
    exchangeRates.put(Currency.NGN, 1.0);
    exchangeRates.put(Currency.KES, 1.0);
    exchangeRates.put(Currency.GHS, 1.0);
    exchangeRates.put(Currency.MAD, 1.0);
    exchangeRates.put(Currency.BAM, 1.0);
    exchangeRates.put(Currency.TND, 1.0);
    exchangeRates.put(Currency.UGX, 1.0);
    exchangeRates.put(Currency.TZS, 1.0);
    exchangeRates.put(Currency.RWF, 1.0);
    exchangeRates.put(Currency.FKP, 1.0);
    exchangeRates.put(Currency.GIP, 1.0);
    exchangeRates.put(Currency.IMP, 1.0);
    exchangeRates.put(Currency.JEP, 1.0);
    exchangeRates.put(Currency.SHP, 1.0);
    exchangeRates.put(Currency.SDG, 1.0);
    exchangeRates.put(Currency.BIF, 1.0);
    exchangeRates.put(Currency.DJF, 1.0);
    exchangeRates.put(Currency.ETB, 1.0);
    exchangeRates.put(Currency.LRD, 1.0);
    exchangeRates.put(Currency.MWK, 1.0);
    exchangeRates.put(Currency.SZL, 1.0);
    exchangeRates.put(Currency.ZMW, 1.0);
    exchangeRates.put(Currency.SOS, 1.0);
    exchangeRates.put(Currency.GMD, 1.0);
    exchangeRates.put(Currency.SLL, 1.0);
    exchangeRates.put(Currency.CVE, 1.0);
    exchangeRates.put(Currency.STN, 1.0);
    exchangeRates.put(Currency.KMF, 1.0);
    exchangeRates.put(Currency.BMD, 1.0);
    exchangeRates.put(Currency.PKR, 1.0);
    exchangeRates.put(Currency.BDT, 1.0);
    exchangeRates.put(Currency.LKR, 1.0);
    exchangeRates.put(Currency.NPR, 1.0);
    exchangeRates.put(Currency.MMK, 1.0);
    exchangeRates.put(Currency.THB, 1.0);
    exchangeRates.put(Currency.VND, 1.0);
    exchangeRates.put(Currency.IDR, 1.0);
    exchangeRates.put(Currency.MYR, 1.0);
    exchangeRates.put(Currency.PHP, 1.0);
    exchangeRates.put(Currency.ILS, 1.0);
    exchangeRates.put(Currency.IRR, 1.0);
    exchangeRates.put(Currency.IQD, 1.0);
    exchangeRates.put(Currency.KWD, 1.0);
    exchangeRates.put(Currency.BHD, 1.0);
    exchangeRates.put(Currency.OMR, 1.0);
    exchangeRates.put(Currency.TWD, 1.0);
    exchangeRates.put(Currency.QAR, 1.0);
    exchangeRates.put(Currency.BTN, 1.0);
    exchangeRates.put(Currency.MOP, 1.0);
    exchangeRates.put(Currency.LAK, 1.0);
    exchangeRates.put(Currency.KGS, 1.0);
    exchangeRates.put(Currency.TJS, 1.0);
    exchangeRates.put(Currency.MZN, 1.0);
    exchangeRates.put(Currency.PLN, 1.0);
    exchangeRates.put(Currency.HUF, 1.0);
    exchangeRates.put(Currency.CZK, 1.0);
    exchangeRates.put(Currency.RON, 1.0);
    exchangeRates.put(Currency.BGN, 1.0);
    exchangeRates.put(Currency.HRK, 1.0);
    exchangeRates.put(Currency.UAH, 1.0);
    exchangeRates.put(Currency.BYN, 1.0);
    exchangeRates.put(Currency.ISK, 1.0);
    exchangeRates.put(Currency.GEL, 1.0);
    exchangeRates.put(Currency.ALL, 1.0);
    exchangeRates.put(Currency.MKD, 1.0);
    exchangeRates.put(Currency.MDL, 1.0);
    exchangeRates.put(Currency.ANG, 1.0);
    exchangeRates.put(Currency.AWG, 1.0);
    exchangeRates.put(Currency.ARS, 1.0);
    exchangeRates.put(Currency.CLP, 1.0);
    exchangeRates.put(Currency.COP, 1.0);
    exchangeRates.put(Currency.PEN, 1.0);
    exchangeRates.put(Currency.UYU, 1.0);
    exchangeRates.put(Currency.PYG, 1.0);
    exchangeRates.put(Currency.BOB, 1.0);
    exchangeRates.put(Currency.VES, 1.0);
    exchangeRates.put(Currency.DOP, 1.0);
    exchangeRates.put(Currency.CUP, 1.0);
    exchangeRates.put(Currency.JMD, 1.0);
    exchangeRates.put(Currency.TTD, 1.0);
    exchangeRates.put(Currency.BSD, 1.0);
    exchangeRates.put(Currency.BBD, 1.0);
    exchangeRates.put(Currency.HTG, 1.0);
    exchangeRates.put(Currency.XCD, 1.0);
    exchangeRates.put(Currency.NIO, 1.0);
    exchangeRates.put(Currency.GTQ, 1.0);
    exchangeRates.put(Currency.HNL, 1.0);
    exchangeRates.put(Currency.CRC, 1.0);
    exchangeRates.put(Currency.PAB, 1.0);
    exchangeRates.put(Currency.BZD, 1.0);
    exchangeRates.put(Currency.SRD, 1.0);
    exchangeRates.put(Currency.FJD, 1.0);
    exchangeRates.put(Currency.PGK, 1.0);
    exchangeRates.put(Currency.SBD, 1.0);
    exchangeRates.put(Currency.WST, 1.0);
    exchangeRates.put(Currency.TOP, 1.0);
    exchangeRates.put(Currency.VUV, 1.0);
    exchangeRates.put(Currency.KID, 1.0);
    exchangeRates.put(Currency.TVD, 1.0);
    exchangeRates.put(Currency.CKD, 1.0);
    exchangeRates.put(Currency.NauruDollar, 1.0);
    exchangeRates.put(Currency.MNT, 1.0);
    exchangeRates.put(Currency.AFN, 1.0);
    exchangeRates.put(Currency.KZT, 1.0);
    exchangeRates.put(Currency.TMT, 1.0);
    exchangeRates.put(Currency.AZN, 1.0);
    exchangeRates.put(Currency.AMD, 1.0);
    exchangeRates.put(Currency.KYD, 1.0);
    exchangeRates.put(Currency.XOF, 1.0);
    exchangeRates.put(Currency.XAF, 1.0);
    exchangeRates.put(Currency.XPF, 1.0);
    exchangeRates.put(Currency.MUR, 1.0);
    exchangeRates.put(Currency.SCR, 1.0);
    exchangeRates.put(Currency.MVR, 1.0);
    exchangeRates.put(Currency.BTC, 1.0);
    exchangeRates.put(Currency.ETH, 1.0);
    }

    public static double convert(double amount, Currency from, Currency to) {
        if (!exchangeRates.containsKey(from) || !exchangeRates.containsKey(to)) {
            throw new IllegalArgumentException("Currency not supported!");
        }
        double amountInUSD = amount / exchangeRates.get(from);   // From → USD
        return amountInUSD * exchangeRates.get(to);              // USD → Target
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter FROM currency code (e.g., USD): ");
        String fromCode = scanner.nextLine().trim().toUpperCase();
        System.out.print("Enter TO currency code (e.g., INR): ");
        String toCode = scanner.nextLine().trim().toUpperCase();

        Currency from = null;
        Currency to = null;
        try {
            from = Currency.valueOf(fromCode);
            to = Currency.valueOf(toCode);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid currency code. Please use one of the supported codes.");
            System.exit(1);
        }

        double result = convert(amount, from, to);
        System.out.printf("%.2f %s = %.2f %s\n", amount, from.getSymbol(), result, to.getSymbol());
    }
}
