package com.tribukaldero.controller.v1;

import com.tribukaldero.model.fuel.FuelType;
import com.tribukaldero.service.FuelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/fuel")
public class FuelControllerClass {

    @Autowired
    private FuelService fuelService;

    @RequestMapping(value = "/FuelTypes", method = RequestMethod.GET)
    public @ResponseBody List<FuelType> getAllFuelTypes() {
        return fuelService.listAllFuelTypes();
    }
}

