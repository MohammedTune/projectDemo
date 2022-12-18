package com.shamaProject.purchaseTransaction.Entities.purchase;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity(name="NewPurchOrder")
public class NewPurchOrder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String newPurchOrderNumber;
    private Date date;
    private String purchaseOrderNumber;
    private Date expectedDeliveryDate;
    private String deliveryAdress;
    private String suppliers;
    private String reference;
    private String formats;
    public NewPurchOrder(){

    }
    public NewPurchOrder(Long id, String newPurchOrderNumber, Date date, String purchaseOrderNumber, Date expectedDeliveryDate, String deliveryAdress, String suppliers, String reference, String formats) {
        this.id = id;
        this.newPurchOrderNumber = newPurchOrderNumber;
        this.date = date;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.deliveryAdress = deliveryAdress;
        this.suppliers = suppliers;
        this.reference = reference;
        this.formats = formats;
    }
    @Override
    public String toString() {
        return "NewPurchOrder{" +
                "id=" + id +
                ", newPurchOrderNumber='" + newPurchOrderNumber + '\'' +
                ", date=" + date +
                ", purchaseOrderNumber='" + purchaseOrderNumber + '\'' +
                ", expectedDeliveryDate=" + expectedDeliveryDate +
                ", deliveryAdress='" + deliveryAdress + '\'' +
                ", suppliers='" + suppliers + '\'' +
                ", reference='" + reference + '\'' +
                ", formats='" + formats + '\'' +
                '}';
    }
}
