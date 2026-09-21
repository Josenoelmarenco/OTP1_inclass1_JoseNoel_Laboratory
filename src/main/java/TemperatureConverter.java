public class TemperatureConverter {
    //Fahrenheit -> Celsius. C= (F-32)* 5/9
    public double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit -32) * 5/9;
    }

    //Celsius -> Fahrenheit. F=(C*9/5) + 32
    public double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    //"Extreme" if below -40 C or above 50 C. Returns a boolean (a decision).
    public boolean isExtremeTemperature(double celsius){
        return celsius < -40 || celsius > 50;
    }

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15; // C = K - 273.15
    }
}
