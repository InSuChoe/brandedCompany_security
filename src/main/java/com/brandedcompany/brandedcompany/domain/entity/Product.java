package com.brandedcompany.brandedcompany.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "PRODUCTS")
public class Product
{
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Integer id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STANDARD_COST")
    private Double standardCost;

    @Column(name = "LIST_PRICE")
    private Double listPrice;

    @ManyToOne
    @JoinColumn(referencedColumnName = "CATEGORY_ID",
                name = "CATEGORY_ID")
    private Set<Integer> categoryId;







}
