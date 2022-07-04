import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * A simple application that converts amount values between different currencies.
 */
public class CurrencyConverterApplication {

    private static InputStream reader = System.in;
    private static PrintStream output = System.out;

    private static Map<String, Double> currencyConversionMap = new HashMap<>();

    static {
        currencyConversionMap.put("EUR->USD", 1.14d);
        currencyConversionMap.put("USD->EUR", 0.87d);
        currencyConversionMap.put("EUR->GBP", 0.85d);
        currencyConversionMap.put("GBP->USD", 1.34d);
        currencyConversionMap.put("USD->GBP", 0.74d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(reader);

        String lineRead = "";
        lineRead = scanner.nextLine();
        while (!lineRead.isBlank()) {
            String[] tokens = lineRead.split(" ");
            String sourceCurrency = tokens[0];
            String targetCurrency = tokens[1];
            String amount = tokens[2];

            double conversionFactor = currencyConversionMap.get(sourceCurrency + "->" + targetCurrency);

            double convertedAmount = Double.valueOf(amount) * conversionFactor;

            output.println(convertedAmount);
            lineRead = scanner.nextLine();
        }
    }
}
