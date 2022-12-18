package com.shamaProject.purchaseTransaction.Entities.purchase;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
  @Entity(name="Purchase")
    public class Purchase implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id", nullable = false)
    private Long id;
    private String PurchaseNumber;
    private Date purchasedDate;
    private int invoiceNumber;
    private Date dueDate;
    private String supplierName;
    private int purchaseAmount;
    private String status;
    public  Purchase(){

}
      public Purchase(Long id, String purchaseNumber, Date purchasedDate, int invoiceNumber, Date dueDate, String supplierName, int purchaseAmount, String status) {
          this.id = id;
          PurchaseNumber = purchaseNumber;
          this.purchasedDate = purchasedDate;
          this.invoiceNumber = invoiceNumber;
          this.dueDate = dueDate;
          this.supplierName = supplierName;
          this.purchaseAmount = purchaseAmount;
          this.status = status;
      }
      public Long getId() {
          return id;
      }
      public void setId(Long id) {
          this.id = id;
      }
      public String getPurchaseNumber() {
          return PurchaseNumber;
      }
      public void setPurchaseNumber(String purchaseNumber) {
          PurchaseNumber = purchaseNumber;
      }
      public Date getPurchasedDate() {
          return purchasedDate;
      }
      public void setPurchasedDate(Date purchasedDate) {
          this.purchasedDate = purchasedDate;
      }
      public int getInvoiceNumber() {
          return invoiceNumber;
      }
      public void setInvoiceNumber(int invoiceNumber) {
          this.invoiceNumber = invoiceNumber;
      }
      public Date getDueDate() {
          return dueDate;
      }
      public void setDueDate(Date dueDate) {
          this.dueDate = dueDate;
      }
      public String getSupplierName() {
          return supplierName;
      }
      public void setSupplierName(String supplierName) {
          this.supplierName = supplierName;
      }
      public int getPurchaseAmount() {
          return purchaseAmount;
      }
      public void setPurchaseAmount(int purchaseAmount) {
          this.purchaseAmount = purchaseAmount;
      }
      public String getStatus() {
          return status;
      }
      public void setStatus(String status) {
          this.status = status;
      }
      @Override
      public String toString() {
          return "Purchase{" +
                  "id=" + id +
                  ", PurchaseNumber='" + PurchaseNumber + '\'' +
                  ", purchasedDate=" + purchasedDate +
                  ", invoiceNumber=" + invoiceNumber +
                  ", dueDate=" + dueDate +
                  ", supplierName='" + supplierName + '\'' +
                  ", purchaseAmount=" + purchaseAmount +
                  ", status='" + status + '\'' +
                  '}';
      }
  }
