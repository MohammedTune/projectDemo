package com.shamaProject.purchaseTransaction.Entities.purchase;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity(name="priceRequest")
public class PriceRequest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private long pricerequestNumber;
    private Date requestDate;
   private Date expectedDate;
    private String reference;
    private String supplierName;
    private String status;
    private String formats;
    public PriceRequest() {
    }

    public PriceRequest(Long id, long pricerequestNumber, Date requestDate, Date expectedDate, String reference, String supplierName, String status, String formats) {
        this.id = id;
        this.pricerequestNumber = pricerequestNumber;
        this.requestDate = requestDate;
        this.expectedDate = expectedDate;
        this.reference = reference;
        this.supplierName = supplierName;
        this.status = status;
        this.formats = formats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getPricerequestNumber() {
        return pricerequestNumber;
    }

    public void setPricerequestNumber(long pricerequestNumber) {
        this.pricerequestNumber = pricerequestNumber;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getExpectedDate() {
        return expectedDate;
    }

    public void setExpectedDate(Date expectedDate) {
        this.expectedDate = expectedDate;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormats() {
        return formats;
    }

    public void setFormats(String formats) {
        this.formats = formats;
    }

    @Override
    public String toString() {
        return "PriceRequest{" +
                "id=" + id +
                ", pricerequestNumber=" + pricerequestNumber +
                ", requestDate=" + requestDate +
                ", expectedDate=" + expectedDate +
                ", reference='" + reference + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", status='" + status + '\'' +
                ", formats='" + formats + '\'' +
                '}';
    }
}
