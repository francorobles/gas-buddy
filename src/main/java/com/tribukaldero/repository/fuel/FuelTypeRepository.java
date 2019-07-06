package com.tribukaldero.repository.fuel;

import com.tribukaldero.model.fuel.FuelType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<FuelType, Integer> {

}