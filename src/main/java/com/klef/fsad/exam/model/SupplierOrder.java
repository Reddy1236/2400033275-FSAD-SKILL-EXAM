package com.klef.fsad.exam.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "supplier_orders")
public class SupplierOrder {

    @Id
    @NotNull(message = "SupplierOrder ID must not be null")
    @Column(name = "supplier_order_id", nullable = false)
    private Long supplierOrderId;

    @NotBlank(message = "Supplier name is required")
    @Column(name = "supplier_name", nullable = false)
    private String supplierName;

    @NotBlank(message = "Product name is required")
    @Column(name = "product_name", nullable = false)
    private String productName;

    @NotNull(message = "Order date is required")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "order_date", nullable = false)
    private LocalDate orderDate;

    @NotBlank(message = "Status is required")
    @Column(nullable = false)
    private String status;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1")
    @Column(nullable = false)
    private Integer quantity;

    @NotNull(message = "Total amount is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Total amount must be greater than zero")
    @Column(name = "total_amount", nullable = false)
    private BigDecimal totalAmount;

    @Column(length = 500)
    private String remarks;

    public Long getSupplierOrderId() {
        return supplierOrderId;
    }

    public void setSupplierOrderId(Long supplierOrderId) {
        this.supplierOrderId = supplierOrderId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
