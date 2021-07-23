package com.backend.carsale.operations;

import com.backend.carsale.dao.InquiryDao;
import com.backend.carsale.dao.ManagerDao;
import com.backend.carsale.dao.StaffDao;
import com.backend.carsale.dao.VehicleDao;
import com.backend.carsale.models.Auth;
import com.backend.carsale.models.Inquiry;
import com.backend.carsale.models.Staff;
import com.backend.carsale.models.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyOperations {

    @Autowired
    private VehicleDao vehicleDao;

    @Autowired
    private StaffDao staffDao;

    @Autowired
    private ManagerDao managerDao;

    @Autowired
    private InquiryDao inquiryDao;

    // vehicle operations
    public ResponseEntity<?> upsertVehicle(Vehicle vehicle){
        vehicleDao.save(vehicle);
        return ResponseEntity.ok("Created");
    }

    public ResponseEntity<?> deleteVehicle(long id){
        vehicleDao.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }

    // staff operations
    public ResponseEntity<?> getAllStaff(){
        Iterable<Staff> s = staffDao.findAll();
        List<Staff> staff = new ArrayList<>();
        s.forEach(staff::add);
        return ResponseEntity.ok(staff);
    }

    public ResponseEntity<?> getStaff(long id){
        return ResponseEntity.ok(staffDao.findById(id));
    }

    public ResponseEntity<?> upsertStaff(Staff staff){
        staffDao.save(staff);
        return ResponseEntity.ok("Created");
    }

    public ResponseEntity<?> deleteStaff(long id){
        staffDao.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }

    // invoice operations
    public ResponseEntity<?> getAllInquiries(){
        Iterable<Inquiry> i = inquiryDao.findAll();
        List<Inquiry> inquiry = new ArrayList<>();
        i.forEach(inquiry::add);
        return ResponseEntity.ok(inquiry);
    }

    public ResponseEntity<?> getInquiry(long id){
        return ResponseEntity.ok(inquiryDao.findById(id));
    }

    public ResponseEntity<?> deleteInquiry(long id){
        inquiryDao.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }
}
