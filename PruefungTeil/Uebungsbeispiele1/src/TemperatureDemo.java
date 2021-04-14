public class TemperatureDemo {
    public static void main(String[] args) {

        double currentTemperatureCelsius = 11;

        System.out.println(currentTemperatureCelsius + "° Celsius sind " + celsiusToFahrenheit(currentTemperatureCelsius) + "° Fahrenheit.");

        System.out.println(celsiusToFahrenheit(currentTemperatureCelsius) + "° Fahrenheit sind " + fahrenheitToCelsius(celsiusToFahrenheit(currentTemperatureCelsius)) + "° Celsius.");

    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) +32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
