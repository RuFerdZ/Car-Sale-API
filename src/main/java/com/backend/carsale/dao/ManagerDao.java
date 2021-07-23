package com.backend.carsale.dao;

import com.backend.carsale.models.Manager;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ManagerDao extends CrudRepository<Manager, Long> {

    Optional<Manager> findByEmailAndPassword(String email, String password);
}
