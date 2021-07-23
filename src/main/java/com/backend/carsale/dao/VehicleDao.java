package com.backend.carsale.dao;

import com.backend.carsale.models.Vehicle;
import org.springframework.data.repository.CrudRepository;


public interface VehicleDao extends CrudRepository<Vehicle, Long> {


}
