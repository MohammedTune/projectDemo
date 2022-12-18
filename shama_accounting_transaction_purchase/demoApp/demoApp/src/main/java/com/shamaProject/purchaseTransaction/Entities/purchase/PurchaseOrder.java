package com.shamaProject.purchaseTransaction.Entities.purchase;
import jakarta.persistence.*;
import java.sql.Date;
import java.io.Serializable;
@Entity(name = "PurchaseOrder")
public class PurchaseOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String PurchOrderNumber;
    private Date purchOrderDate;
    private Date expectedDate;
    private String deliveryAdress;
    private String supplierName;
    private double purchasedAmount;
    private String reference;
    private String status;
    public PurchaseOrder() {
    }public PurchaseOrder(Long id, String purchOrderNumber, Date purchOrderDate, Date expectedDate, String deliveryAdress, String supplierName, double purchasedAmount, String reference, String status) {
        this.id = id;
        PurchOrderNumber = purchOrderNumber;
        this.purchOrderDate = purchOrderDate;
        this.expectedDate = expectedDate;
        this.deliveryAdress = deliveryAdress;
        this.supplierName = supplierName;
        this.purchasedAmount = purchasedAmount;
        this.reference = reference;
        this.status = status;
    }
    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "id=" + id +
                ", PurchOrderNumber='" + PurchOrderNumber + '\'' +
                ", purchOrderDate=" + purchOrderDate +
                ", expectedDate=" + expectedDate +
                ", deliveryAdress='" + deliveryAdress + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", purchasedAmount=" + purchasedAmount +
                ", reference='" + reference + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

