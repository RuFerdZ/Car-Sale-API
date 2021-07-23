package com.backend.carsale.operations;

import com.backend.carsale.dao.InquiryDao;
import com.backend.carsale.dao.ManagerDao;
import com.backend.carsale.dao.StaffDao;
import com.backend.carsale.dao.VehicleDao;
import com.backend.carsale.models.Auth;
import com.backend.carsale.models.Inquiry;
import com.backend.carsale.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicOperations {

    @Autowired
    private VehicleDao vehicleDao;

    @Autowired
    private InquiryDao inquiryDao;

    @Autowired
    private StaffDao staffDao;

    @Autowired
    private ManagerDao managerDao;

    // authentication
    public ResponseEntity<?> loginUser(Auth auth){
        if (auth.getRole().equals("manager")){
            if (managerDao.findByEmailAndPassword(auth.getEmail(), auth.getPassword()).isPresent()){
                return ResponseEntity.ok(managerDao.findByEmailAndPassword(auth.getEmail(), auth.getPassword()).get());
            }
        }
        if (auth.getRole().equals("staff")){
            if (staffDao.findByEmailAndPassword(auth.getEmail(), auth.getPassword()).isPresent()){
                return ResponseEntity.ok(staffDao.findByEmailAndPassword(auth.getEmail(), auth.getPassword()).get());
            }
        }

        return ResponseEntity.ok("Invalid Credentials");
    }


    // vehicle operations
    public ResponseEntity<?> getAllVehicles(){
        Iterable<Vehicle> v = vehicleDao.findAll();
        List<Vehicle> vehicles = new ArrayList<>();
        v.forEach(vehicles::add);
        return ResponseEntity.ok(vehicles);
    }

    public ResponseEntity<?> getVehicle(long id){
        return ResponseEntity.ok(vehicleDao.findById(id));
    }

    // inquiry operations
    public ResponseEntity<?> addInquiry(Inquiry inquiry){
        inquiryDao.save(inquiry);
        return ResponseEntity.ok("Created");
    }
}
