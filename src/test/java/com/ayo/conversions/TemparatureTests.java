package com.ayo.conversions;

import com.ayo.conversions.convert.ConvertService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemparatureTests {

    private ConvertService underTest;

    @BeforeEach
    void setUp() {
        underTest = new ConvertService();
    }

    @Test
    void itShouldConvertCelsiusToFahrenheit() {
        //Given
        String unitOut = "Fahrenheit";
        double val = 2;

        //When
        String results = underTest.convertTemperature(val, unitOut);

        //Then
        assertThat(results).isEqualTo("35.60 F");
    }

    @Test
    void itShouldConvertFahrenheitToCelsius() {
        //Given
        String unitOut = "Celsius";
        double val = 2;

        //When
        String results = underTest.convertTemperature(val, unitOut);

        //Then
        assertThat(results).isEqualTo("-16.67 C");
    }

}
