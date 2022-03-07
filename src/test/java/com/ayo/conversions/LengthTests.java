package com.ayo.conversions;

import com.ayo.conversions.convert.ConvertService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LengthTests {

    private ConvertService underTest;

    @BeforeEach
    void setUp() {
        underTest = new ConvertService();
    }

    @Test
    void itShouldConvertKilometer2Metre() {
        //Given
        String unitIn = "km";
        String unitOut = "m";
        double val = 2;

        //When
        String results = underTest.convertSI(val, unitIn, unitOut);

        //Then
        assertThat(results).isEqualTo("2000.0 m");
    }

    @Test
    void itShouldConvertMeter2Kilometer() {
        //Given
        String unitIn = "m";
        String unitOut = "km";
        double val = 1000.0;

        //When
        String results = underTest.convertSI(val, unitIn, unitOut);

        //Then
        assertThat(results).isEqualTo("1.0 km");
    }
}
