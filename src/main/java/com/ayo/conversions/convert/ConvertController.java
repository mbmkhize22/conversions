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

    @GetMapping(path = "convert/{unitIn}/{unitOut}/{value}")
    public String convert(@PathVariable String unitIn, @PathVariable String unitOut, @PathVariable double value) {
        return this.convertService.convertSI(value, unitIn, unitOut);
    }
}
