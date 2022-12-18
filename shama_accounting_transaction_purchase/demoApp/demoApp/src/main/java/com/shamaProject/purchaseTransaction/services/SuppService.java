package com.shamaProject.purchaseTransaction.services;

import com.shamaProject.purchaseTransaction.Entities.suppliers.Supplier;
import com.shamaProject.purchaseTransaction.repositories.SuppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class SuppService {
    private final SuppRepo SuppRepo;
    @Autowired
    public SuppService(SuppRepo SuppRepo){

        this.SuppRepo=SuppRepo;
    }
 public Supplier getSuppliers(Supplier supplier){

        return SuppRepo.save(supplier);
}
    public Supplier addSuppliers(Supplier supplier) {
        supplier.setSupplierNumber(UUID.randomUUID().toString());
        return SuppRepo.save(supplier);
    }
     public List<Supplier> findAllSuppliers(Supplier supplier){

        return SuppRepo.findAll();
    }
    public Supplier updateSuppliers(Supplier supplier){

        return SuppRepo.save(supplier);
    }
    public Optional<Supplier> findSuppliersById(long id){

        return SuppRepo.findSuppliersById(id);
    }
    public void deleteSuppliers(long id){

         SuppRepo.deleteSuppliersById(id);
    }
    }
