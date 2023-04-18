package com.gabrielbo.test1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @Column(name = "order_id")
    private int orderId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @Column(name = "total_cost")
    private int totalCost;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customer +
                ", totalCost=" + totalCost +
                '}';
    }
}
