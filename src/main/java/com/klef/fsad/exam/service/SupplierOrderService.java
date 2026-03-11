package com.klef.fsad.exam.service;

import com.klef.fsad.exam.exception.ResourceNotFoundException;
import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.repository.SupplierOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierOrderService {

    private final SupplierOrderRepository supplierOrderRepository;

    public SupplierOrderService(SupplierOrderRepository supplierOrderRepository) {
        this.supplierOrderRepository = supplierOrderRepository;
    }

    public SupplierOrder addSupplierOrder(SupplierOrder supplierOrder) {
        if (supplierOrderRepository.existsById(supplierOrder.getSupplierOrderId())) {
            throw new IllegalArgumentException("SupplierOrder ID already exists: " + supplierOrder.getSupplierOrderId());
        }
        return supplierOrderRepository.save(supplierOrder);
    }

    public List<SupplierOrder> getAllSupplierOrders() {
        return supplierOrderRepository.findAll();
    }

    public SupplierOrder getSupplierOrderById(Long supplierOrderId) {
        return supplierOrderRepository.findById(supplierOrderId)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "SupplierOrder not found with ID: " + supplierOrderId));
    }
}
