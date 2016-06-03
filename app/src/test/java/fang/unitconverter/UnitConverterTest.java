package fang.unitconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Fang2 on 2016/6/3.
 */
public class UnitConverterTest {
    @Test
    public void testConvertFahrenheitToCelsius() {
        float actual = TempConverter.convertCelsiusToFahrenheit(100);
        // expected value is 212
        float expected = 212;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected,
                actual, 0.001);
    }

    @Test
    public void testConvertCelsiusToFahrenheit() {
        float actual = TempConverter.convertFahrenheitToCelsius(212);
        // expected value is 100
        float expected = 100;
        // use this method because float is not precise
        assertEquals("Conversion from celsius to fahrenheit failed", expected,
                actual, 0.001);
    }
}
