package com.shamaProject.purchaseTransaction.repositories;
import com.shamaProject.purchaseTransaction.Entities.suppliers.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
public interface SuppRepo extends JpaRepository<Supplier, Long> {
    void deleteSuppliersById(long id);

    Optional<Supplier> findSuppliersById(long id);

          @Override
    List<Supplier> findAll();
}
