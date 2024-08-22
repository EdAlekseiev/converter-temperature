package app;

public class Main {
    public static final double CONV_K = 1.8;
    public static final double FAHRENHEIT_SCALE = 32.0;

    public static void main(String[] args) {
        System.out.println("Converter Temperature");
        System.out.println("Version 1.2");

        double fahrenheits = 75;
        double celsius = fahrenheitToCelsius(fahrenheits);
        System.out.println(fahrenheits + " fahrenheits are " + celsius + " celsius.");

        celsius = 21.5;
        fahrenheits = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " celsius are " + fahrenheits + " fahrenheits.");
    }

    private static double fahrenheitToCelsius(double fahrenheits) {
        return (fahrenheits - FAHRENHEIT_SCALE) / CONV_K;
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * CONV_K) + FAHRENHEIT_SCALE;
    }
}
