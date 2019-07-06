package com.tribukaldero.controller.v1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/fuel")
public class FuelControllerClass {

    @RequestMapping(value = "/getGasPrices", method = RequestMethod.GET)
    public String getGasPrices() {
        return "Fuel Controller";
    }
}

