package org.example.euroconverter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class SekToEuroController {

    @GetMapping("/sek2euro")
    public Double getConversion(Double sek) {
        Double euro = sek * 0.091;
        return euro;
    }

}
