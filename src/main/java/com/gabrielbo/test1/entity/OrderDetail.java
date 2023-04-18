package com.gabrielbo.test1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @Column(name = "order_detail_id")
    private int orderDetailId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "qty")
    private int qty;

    @Column(name = "subtotal")
    private int subtotal;

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailId=" + orderDetailId +
                ", order=" + order +
                ", productId=" + productId +
                ", qty=" + qty +
                ", subtotal=" + subtotal +
                '}';
    }
}
