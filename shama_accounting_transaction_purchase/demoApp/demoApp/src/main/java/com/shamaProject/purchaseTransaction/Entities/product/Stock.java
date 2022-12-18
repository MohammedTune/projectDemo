package com.shamaProject.purchaseTransaction.Entities.product;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity(name="Stock")
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private long stockNumber;
    private String details;
    private Date date;
    private String units;
    private int balanceQty;
    private double lastPrice;
    private double totalBirr;
    private String Status;
    public Stock(){

    }
    public Stock(Long id, long stockNumber, String details, Date date, String units, int balanceQty, double lastPrice, double totalBirr, String status) {
        this.id = id;
        this.stockNumber = stockNumber;
        this.details = details;
        this.date = date;
        this.units = units;
        this.balanceQty = balanceQty;
        this.lastPrice = lastPrice;
        this.totalBirr = totalBirr;
        Status = status;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getStockNumber() {
        return stockNumber;
    }
    public void setStockNumber(long stockNumber) {
        this.stockNumber = stockNumber;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getUnits() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public int getBalanceQty() {
        return balanceQty;
    }
    public void setBalanceQty(int balanceQty) {
        this.balanceQty = balanceQty;
    }
    public double getLastPrice() {
        return lastPrice;
    }
    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }
    public double getTotalBirr() {
        return totalBirr;
    }
    public void setTotalBirr(double totalBirr) {
        this.totalBirr = totalBirr;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", stockNumber=" + stockNumber +
                ", details='" + details + '\'' +
                ", date=" + date +
                ", units='" + units + '\'' +
                ", balanceQty=" + balanceQty +
                ", lastPrice=" + lastPrice +
                ", totalBirr=" + totalBirr +
                ", Status='" + Status + '\'' +
                '}';
    }
}
