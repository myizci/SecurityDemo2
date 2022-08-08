package com.oft.securitydemo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @SequenceGenerator(name = "productSequence", sequenceName = "productSequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productSequence")
    private Integer productId;

    private String name;

    private String description;

    private Double price;


    public Product(Integer productId, String name, String desc, Double price){

        this(name, desc, price);

        this.productId = productId;

    }

    public Product(){

    }

    public Product(String name, String desc, Double price) {

        this.name = name;

        this.description = desc;

        this.price = price;

    }



}
