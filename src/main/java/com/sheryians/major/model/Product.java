package com.sheryians.major.model;

import lombok.Data;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    //a single category can have multiple products
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
