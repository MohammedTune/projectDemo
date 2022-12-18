package com.shamaProject.purchaseTransaction.controllers;

import com.shamaProject.purchaseTransaction.Entities.suppliers.Supplier;
import com.shamaProject.purchaseTransaction.services.SuppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/suppliers")
public class SuppController {
    private SuppService supservise;
    private long Suppliers;
     public SuppController(SuppService supservise) {
         this.supservise = supservise;
    }
        @PostMapping("/add")

    public ResponseEntity<Supplier> addSuppliers(@RequestBody Supplier supplier){
        Supplier newSupplier =supservise.addSuppliers(supplier);
        return new ResponseEntity<>(newSupplier,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Supplier> updateSuppliers(@RequestBody Supplier supplier){
        Supplier updateSupplier =supservise.updateSuppliers(supplier);
        return new ResponseEntity<>(updateSupplier,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSuppliers(@PathVariable("id") long id){
       supservise.deleteSuppliers(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
     }


