package com.ayo.conversions.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/converter")
public class ConvertController {

    private final ConvertService convertService;

    @Autowired
    public ConvertController(ConvertService convertService) {
        this.convertService = convertService;
    }

    @GetMapping
    public String apiStatus() {
        return "Converter - API Running...";
    }

    @GetMapping(path = "convert/{unitIn}/{unitOut}/{value}/{type}")
    public String convert(@PathVariable String unitIn, @PathVariable String unitOut, @PathVariable double value, @PathVariable String type) {
        if(type.equalsIgnoreCase("temperature")) {
            return this.convertService.convertTemperature(value, unitOut);
        }else if(type.equalsIgnoreCase("length")) {
            return this.convertService.convertSI(value, unitIn, unitOut);
        }else{
            return "Invalid type selected, it should be temperature or length";
        }
    }
}
