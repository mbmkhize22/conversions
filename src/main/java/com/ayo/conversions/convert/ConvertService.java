package com.ayo.conversions.convert;

import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.logging.Logger;

@Service
public class ConvertService {
    private static final Logger LOG = Logger.getLogger(ConvertService.class.getName());

    Hashtable<String, Double> loadMatrics = new Hashtable<>();

    public void loadMetric() {
        loadMatrics.put("mm", 0.001);
        loadMatrics.put("cm", 0.001);
        loadMatrics.put("m", 1.0);
        loadMatrics.put("km", 1000.0);
    }

    public String convertSI(double val, String unitIn, String unitOut) {
        loadMetric();
        double calc = val * loadMatrics.get(unitIn) / loadMatrics.get(unitOut);
        return calc + " " + unitOut;
    }
}
