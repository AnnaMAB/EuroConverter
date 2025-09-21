package org.example.euroconverter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/convert")
public class SekToEuroController {

    @GetMapping("/sek2euro")
    public double getConversionRate() {

        double min = 0.082;
        double max = 0.111;
        double sekToEuroRate = min + (Math.random() * (max - min));

        return sekToEuroRate;
    }


}
