package com.klef.fsad.exam.controller;

import com.klef.fsad.exam.model.SupplierOrder;
import com.klef.fsad.exam.service.SupplierOrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/supplierorders")
public class SupplierOrderController {

    private final SupplierOrderService supplierOrderService;

    public SupplierOrderController(SupplierOrderService supplierOrderService) {
        this.supplierOrderService = supplierOrderService;
    }

    @PostMapping
    public ResponseEntity<SupplierOrder> addSupplierOrder(@Valid @RequestBody SupplierOrder supplierOrder) {
        SupplierOrder savedOrder = supplierOrderService.addSupplierOrder(supplierOrder);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);
    }

    @GetMapping
    public ResponseEntity<List<SupplierOrder>> getAllSupplierOrders() {
        return ResponseEntity.ok(supplierOrderService.getAllSupplierOrders());
    }

    @GetMapping("/{supplierOrderId}")
    public ResponseEntity<SupplierOrder> getSupplierOrderById(@PathVariable Long supplierOrderId) {
        return ResponseEntity.ok(supplierOrderService.getSupplierOrderById(supplierOrderId));
    }
}
