package com.shamaProject.purchaseTransaction.Entities.purchase;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity(name="DebitNote")
public class DebitNote implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private long debitNoteNumber;
    private Date date;
    private String supplirs;
    private String reference;
    private String supplierInvoiceNumber;
    private int invoiceAmount;
    private double debiteAmount;
    private String status;
    public DebitNote() {
    }
    public DebitNote(Long id, long debitNoteNumber, Date date, String supplirs, String reference, String supplierInvoiceNumber, int invoiceAmount, double debiteAmount, String status) {
        this.id = id;
        this.debitNoteNumber = debitNoteNumber;
        this.date = date;
        this.supplirs = supplirs;
        this.reference = reference;
        this.supplierInvoiceNumber = supplierInvoiceNumber;
        this.invoiceAmount = invoiceAmount;
        this.debiteAmount = debiteAmount;
        this.status = status;
    }
    @Override
    public String toString() {
        return "DebitNote{" +
                "id=" + id +
                ", debitNoteNumber=" + debitNoteNumber +
                ", date=" + date +
                ", supplirs='" + supplirs + '\'' +
                ", reference='" + reference + '\'' +
                ", supplierInvoiceNumber='" + supplierInvoiceNumber + '\'' +
                ", invoiceAmount=" + invoiceAmount +
                ", debiteAmount=" + debiteAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
