package com.shamaProject.purchaseTransaction.Entities.product;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
public class FixedAsset implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private long fixedAssetNumber;
    private String catagory;
    private Date purchasedDate;
    private String details;
    private double initialCost;
    private double totalDeperetiation;
    private double addCost;
    private int closingBalance;
    private String status;
    public FixedAsset(){

    }
    public FixedAsset(Long id, long fixedAssetNumber, String catagory, Date purchasedDate, String details, double initialCost, double totalDeperetiation, double addCost, int closingBalance, String status) {
        this.id = id;
        this.fixedAssetNumber = fixedAssetNumber;
        this.catagory = catagory;
        this.purchasedDate = purchasedDate;
        this.details = details;
        this.initialCost = initialCost;
        this.totalDeperetiation = totalDeperetiation;
        this.addCost = addCost;
        this.closingBalance = closingBalance;
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getFixedAssetNumber() {
        return fixedAssetNumber;
    }
    public void setFixedAssetNumber(long fixedAssetNumber) {
        this.fixedAssetNumber = fixedAssetNumber;
    }
    public String getCatagory() {
        return catagory;
    }
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    public Date getPurchasedDate() {
        return purchasedDate;
    }
    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }
    public double getTotalDeperetiation() {
        return totalDeperetiation;
    }
    public void setTotalDeperetiation(double totalDeperetiation) {
        this.totalDeperetiation = totalDeperetiation;
    }
    public double getAddCost() {
        return addCost;
    }
    public void setAddCost(double addCost) {
        this.addCost = addCost;
    }
    public int getClosingBalance() {
        return closingBalance;
    }
    public void setClosingBalance(int closingBalance) {
        this.closingBalance = closingBalance;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "FixedAsset{" +
                "id=" + id +
                ", fixedAssetNumber=" + fixedAssetNumber +
                ", catagory='" + catagory + '\'' +
                ", purchasedDate=" + purchasedDate +
                ", details='" + details + '\'' +
                ", initialCost=" + initialCost +
                ", totalDeperetiation=" + totalDeperetiation +
                ", addCost=" + addCost +
                ", closingBalance=" + closingBalance +
                ", status='" + status + '\'' +
                '}';
    }
}
