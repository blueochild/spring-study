package com.blueochild.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    @Column(length = 50, nullable = false)
    private String couponId;

    @Column(length = 50, nullable = false)
    private String couponName;

    @Column(length = 50, nullable = false)
    private String couponContent;

    @Column(length = 4, nullable = false)
    private int couponUsed;

    @Column(length = 4, nullable = false)
    private int couponFormat;

    @Column(length = 4, nullable = false)
    private int couponSale;

    @Column(length = 50, nullable = false)
    private String couponDate;

    @Builder
    public Coupon(String userId, String couponId, String couponName, String couponContent
            , int couponUsed, int couponFormat, int couponSale, String couponDate){
        this.userId = userId;
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponContent = couponContent;
        this.couponUsed = couponUsed;
        this.couponFormat = couponFormat;
        this.couponSale = couponSale;
        this.couponDate = couponDate;
    }

    @Override
    public String toString(){
        return String.format("Seller[user_id='%s', couponId='%s', couponName='%s', couponContent='%s', couponUsed=%d, couponFormat=%d, couponSale=%d, couponDate='%s']",
                this.userId, this.couponId, this.couponName, this.couponContent, this.couponUsed, this.couponFormat, this.couponSale, this.couponDate);
    }

}
