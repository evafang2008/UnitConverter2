package fang.unitconverter;

/**
 *
 * @author Fang Fang
 * Date 2016/6/3
 *        Temperature Converter
 *        *********************
 */
public class TempConverter {
    // converts to celsius
    public static float convertFahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32) * 5 / 9);
    }

    // converts to fahrenheit
    public static float convertCelsiusToFahrenheit(float celsius){
        return ((celsius * 9) / 5) + 32;
    }
}
