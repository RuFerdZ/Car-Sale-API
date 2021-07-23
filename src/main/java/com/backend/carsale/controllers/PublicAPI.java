package com.backend.carsale.controllers;

import com.backend.carsale.models.Auth;
import com.backend.carsale.models.Inquiry;
import com.backend.carsale.operations.PublicOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class PublicAPI {

    @Autowired
    PublicOperations operations;

    @GetMapping(value = "/test")
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("Backend Works");
    }

    @GetMapping(value = "/vehicles")
    public ResponseEntity<?> getAllVehicles(){
        return operations.getAllVehicles();
    }

    @GetMapping(value = "/vehicle/{id}")
    public ResponseEntity<?> getVehicleById(@PathVariable("id") long id){
        return operations.getVehicle(id);
    }

    @PostMapping(value = "/inquiry/submit")
    public ResponseEntity<?> addInquiry(@RequestBody Inquiry inquiry){
        return operations.addInquiry(inquiry);
    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> login(@RequestBody Auth auth){
        return operations.loginUser(auth);
    }

}
