package com.robxx.insxboot.model;

public class Policy {

    Long id;
    String accountName;
    String vehicleMake;
    String vehicleModel;
    String vehicleRegistration;
    String email;
    Float premium;

    public Policy() {
    }

    public Policy(Long id, String accountName, String vehicleMake, String vehicleModel, String vehicleRegistration, String email, Float premium) {
        this.id = id;
        this.accountName = accountName;
        this.vehicleMake = vehicleMake;
        this.vehicleModel = vehicleModel;
        this.vehicleRegistration = vehicleRegistration;
        this.email = email;
        this.premium = premium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(String vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getPremium() {
        return premium;
    }

    public void setPremium(Float premium) {
        this.premium = premium;
    }


}
