package com.backend.carsale.controllers;

import com.backend.carsale.models.Staff;
import com.backend.carsale.models.Vehicle;
import com.backend.carsale.operations.CompanyOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin("*")
public class CompanyAPI {

    @Autowired
    CompanyOperations operations;

    @PostMapping(value = "/vehicle/upsert")
    public ResponseEntity<?> addOrUpdateVehicle(@RequestBody Vehicle vehicle){
        return operations.upsertVehicle(vehicle);
    }

    @PutMapping(value = "/vehicle/{id}/image-upload")
    public ResponseEntity<?> addImageToVehicle(@PathVariable("id") long id, @RequestBody MultipartFile image){
        return operations.addImage(id, image);
    }

    @DeleteMapping(value = "/vehicle/{id}")
    public ResponseEntity<?> deleteVehicle(@PathVariable("id") long id){
        return operations.deleteVehicle(id);
    }

    @GetMapping(value = "/staff")
    public ResponseEntity<?> getAllStaff(){
        return operations.getAllStaff();
    }

    @GetMapping(value = "/staff/{id}")
    public ResponseEntity<?> getStaffById(@PathVariable("id") long id){
        return operations.getStaff(id);
    }

    @PostMapping(value = "/staff/upsert")
    public ResponseEntity<?> addOrUpdateStaff(@RequestBody Staff staff){
        return operations.upsertStaff(staff);
    }

    @DeleteMapping(value = "/delete/staff/{id}")
    public ResponseEntity<?> deleteStaff(@PathVariable("id") long id){
        return operations.deleteStaff(id);
    }

    @GetMapping(value = "/inquiries")
    public ResponseEntity<?> getAllInquiries(){
        return operations.getAllInquiries();
    }

    @GetMapping(value = "/inquiry/{id}")
    public ResponseEntity<?> getInquiryById(@PathVariable("id") long id){
        return operations.getInquiry(id);
    }

    @DeleteMapping(value = "/delete/inquiry/{id}")
    public ResponseEntity<?> deleteInquiry(@PathVariable("id") long id){
        return operations.deleteInquiry(id);
    }
}
