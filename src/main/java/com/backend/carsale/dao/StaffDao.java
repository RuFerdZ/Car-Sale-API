package com.backend.carsale.dao;

import com.backend.carsale.models.Manager;
import com.backend.carsale.models.Staff;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StaffDao extends CrudRepository<Staff, Long> {

    Optional<Staff> findByEmailAndPassword(String email, String password);
}
