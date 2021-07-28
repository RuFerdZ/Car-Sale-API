package com.backend.carsale.models;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Objects;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String vehicleNumber;

    @Column
    private String VIN;

    @Column
    private String color;

    @Column
    private String transmission;

    @Column(columnDefinition="tinyint(1) default 1")
    private boolean commissioned;

    @Column
    private String bodyType;

    @Column
    private String model;

    @Column
    private int yearOfRegister;

    @Column
    private int yearOfManufac;

    @Column
    private int passengerTotal;

    @Column
    private int noOfOwners;

    @Column
    private int mileAge;

    @Column
    private String extraInfo;

    @Column
    private double price;

    @Column
    private ZonedDateTime addedDate;

    @Column
    private ZonedDateTime soldDate;

    @PrePersist
    public void onPersist() {
        addedDate = ZonedDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public boolean isCommissioned() {
        return commissioned;
    }

    public void setCommissioned(boolean commissioned) {
        this.commissioned = commissioned;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRegister() {
        return yearOfRegister;
    }

    public void setYearOfRegister(int yearOfRegister) {
        this.yearOfRegister = yearOfRegister;
    }

    public int getYearOfManufac() {
        return yearOfManufac;
    }

    public void setYearOfManufac(int yearOfManufac) {
        this.yearOfManufac = yearOfManufac;
    }

    public int getPassengerTotal() {
        return passengerTotal;
    }

    public void setPassengerTotal(int passengerTotal) {
        this.passengerTotal = passengerTotal;
    }

    public int getNoOfOwners() {
        return noOfOwners;
    }

    public void setNoOfOwners(int noOfOwners) {
        this.noOfOwners = noOfOwners;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ZonedDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(ZonedDateTime addedDate) {
        this.addedDate = addedDate;
    }

    public ZonedDateTime getSoldDate() {
        return soldDate;
    }

    public void setSoldDate(ZonedDateTime soldDate) {
        this.soldDate = soldDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfRegister == vehicle.yearOfRegister && yearOfManufac == vehicle.yearOfManufac && passengerTotal == vehicle.passengerTotal && noOfOwners == vehicle.noOfOwners && mileAge == vehicle.mileAge && Objects.equals(id, vehicle.id) && Objects.equals(vehicleNumber, vehicle.vehicleNumber) && Objects.equals(color, vehicle.color) && Objects.equals(transmission, vehicle.transmission) && Objects.equals(bodyType, vehicle.bodyType) && Objects.equals(model, vehicle.model) && Objects.equals(extraInfo, vehicle.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vehicleNumber, color, transmission, bodyType, model, yearOfRegister, yearOfManufac, passengerTotal, noOfOwners, mileAge, extraInfo);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", color='" + color + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", model='" + model + '\'' +
                ", yearOfRegister=" + yearOfRegister +
                ", yearOfManufac=" + yearOfManufac +
                ", passengerTotal=" + passengerTotal +
                ", noOfOwners=" + noOfOwners +
                ", mileAge=" + mileAge +
                ", extraInfo='" + extraInfo + '\'' +
                '}';
    }
}
