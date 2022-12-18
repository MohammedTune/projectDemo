package com.shamaProject.purchaseTransaction.Entities.suppliers;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "Supplier")
public class Supplier implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private String  supplierNumber;
    private String contactPerson;
    private String firstName;
    private String secondName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String telephone;
    private String houseNumber;
    private String streetName;
    private String woreda;
    private String city;
    private String region;
    private int tin;
    private int vat;

    public Supplier() {
    }
    public Supplier(String supplierNumber, String contactPerson,
                    String firstName, String secondName) {
        this.supplierNumber = supplierNumber;
        this.contactPerson = contactPerson;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.telephone = telephone;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.woreda = woreda;
        this.city = city;
        this.region = region;
        this.tin = tin;
        this.vat = vat;
            }
    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getWoreda() {
        return woreda;
    }

    public void setWoreda(String woreda) {
        this.woreda = woreda;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getTin() {
        return tin;
    }

    public void setTin(int tin) {
        this.tin = tin;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierNumber='" + supplierNumber + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", telephone='" + telephone + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", woreda='" + woreda + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", tin=" + tin +
                ", vat=" + vat +
                '}';
    }
}

