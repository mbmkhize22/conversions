package com.ayo.conversions.convert;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Convert {
    private String name;
    private double quantity;
    private String unit;

    public Convert() { }

    public Convert(String name, double quantity, String unit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
    }
}
