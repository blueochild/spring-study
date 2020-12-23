package com.blueochild.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(length = 50, nullable = false)
    private String productId;

    @Column(length = 20, nullable = false)
    private String productName ;

    @Column(length = 50, nullable = false)
    private int amount;

    @Column(length = 12, nullable = false)
    private String couponId;

    @Column(length = 2, nullable = false)
    private int rocket;

    @Column(length = 50, nullable = false)
    private int shippingFee;

    @Column(length = 50, nullable = false)
    private String address;

    @Column(length = 50, nullable = false)
    private int stackPoint;

    @Column(length = 50, nullable = false)
    private int orderStatus;

    @Column(length = 50, nullable = false)
    private int totalPrice;

    @Builder
    public Order(String userId, String productId, String productName, int amount, String couponId, int rocket, int shippingFee, String address, int stackPoint, int orderStatus, int totalPrice){
        this.userId = userId;
        this.productId = productId;
        this.productName = productName;
        this.amount = amount;
        this.couponId = couponId;
        this.rocket = rocket;
        this.shippingFee = shippingFee;
        this.address = address;
        this.stackPoint = stackPoint;
        this.orderStatus = orderStatus;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString(){
        return String.format(
                "User[user_Id='%s', product_Id='%s', product_Name='%s', amount=%d, couponId='%s', rocket=%d, shippingFee=%d, address='%s', stackPoint=%d, orderStatus=%d, totalPrice=%d]",
                this.userId, this.productId, this.productName, this.amount,this.couponId , this.rocket, this.shippingFee, this.address, this.stackPoint , this.orderStatus , this.totalPrice
        );
    }

}
