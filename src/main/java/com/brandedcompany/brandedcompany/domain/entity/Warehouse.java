package com.brandedcompany.brandedcompany.domain.entity;

import lombok.NoArgsConstructor;

import javax.naming.Name;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "WAREHOUSES")
@NoArgsConstructor
public class Warehouse
{
    @Id
    @GeneratedValue
    @Column(name = "WAREHOUSE_ID")
    private Integer id;

    @Column(name = "WAREHOUSE_NAME")
    private String name;

    @Column(name = "LOCATION_ID")
    private Integer locationId;

    @ElementCollection
    private Set<Integer> productIds=new HashSet<>();

    public Warehouse(String name, Integer locationId)
    {
        this.name = name;
        this.locationId = locationId;
    }
}
