package com.ayo.conversions.convert;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.logging.Logger;

@Service
public class ConvertService {
    private static final Logger LOG = Logger.getLogger(ConvertService.class.getName());
    private static final DecimalFormat df = new DecimalFormat("0.00");

    Hashtable<String, Double> loadMatricsLength = new Hashtable<>();
    Hashtable<String, Double> loadMatricsTemp = new Hashtable<>();


    public void loadMetricLength() {
        loadMatricsLength.put("mm", 0.001);
        loadMatricsLength.put("cm", 0.001);
        loadMatricsLength.put("m", 1.0);
        loadMatricsLength.put("km", 1000.0);
    }


    public String convertSI(double val, String unitIn, String unitOut) {
        loadMetricLength();
        double calc = val * loadMatricsLength.get(unitIn) / loadMatricsLength.get(unitOut);
        return calc + " " + unitOut;
    }

    public String convertTemperature(double val, String unitOut) {
        if(unitOut.equalsIgnoreCase("Celsius")) {
            return "" + df.format((val - 32) / 1.8) + " C"; // = Celsius
        }else  if(unitOut.equalsIgnoreCase("Fahrenheit")) {
            return "" + df.format((val * 1.8) + 32) + " F"; // = Fahrenheit
        }else{
            return "Invalid type.";
        }
    }


}
