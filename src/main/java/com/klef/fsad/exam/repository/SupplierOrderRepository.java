package com.klef.fsad.exam.repository;

import com.klef.fsad.exam.model.SupplierOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierOrderRepository extends JpaRepository<SupplierOrder, Long> {
}
