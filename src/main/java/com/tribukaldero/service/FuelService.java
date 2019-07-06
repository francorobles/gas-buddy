package com.tribukaldero.service;

import com.tribukaldero.model.fuel.FuelType;
import com.tribukaldero.repository.fuel.FuelTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FuelService {

    @Autowired
    private FuelTypeRepository fuelTypeRepository;


    public List<FuelType> listAllFuelTypes() {
        return fuelTypeRepository.findAll();
    }


}
