package com.backend.carsale.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String staffName;

    @Column(columnDefinition = "TEXT")
    private String staffAddress;

    @Column
    private int staffContactNo;

    @Column
    private int staffSalary;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public int getStaffContactNo() {
        return staffContactNo;
    }

    public void setStaffContactNo(int staffContactNo) {
        this.staffContactNo = staffContactNo;
    }

    public int getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(int staffSalary) {
        this.staffSalary = staffSalary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return staffContactNo == staff.staffContactNo && staffSalary == staff.staffSalary && Objects.equals(id, staff.id) && Objects.equals(staffName, staff.staffName) && Objects.equals(staffAddress, staff.staffAddress) && Objects.equals(email, staff.email) && Objects.equals(password, staff.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, staffName, staffAddress, staffContactNo, staffSalary, email, password);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", staffName='" + staffName + '\'' +
                ", staffAddress='" + staffAddress + '\'' +
                ", staffContactNo=" + staffContactNo +
                ", staffSalary=" + staffSalary +
                ", email='" + email + '\'' +
                '}';
    }
}
