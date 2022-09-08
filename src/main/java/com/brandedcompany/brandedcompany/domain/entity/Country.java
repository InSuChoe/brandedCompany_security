package com.brandedcompany.brandedcompany.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRIES")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Country
{
    @Id
    @GeneratedValue
    @Column(name = "COUNTRY_ID")
    private Integer id;

    @Column(name = "COUNTRY_NAME")
    private String name;

    @Column(name = "REGION_ID")
    private Integer regionId;

    public Country(String name, Integer regionId)
    {
        this.name = name;
        this.regionId = regionId;
    }

    public Country(String name, Region.REGION region)
    {
        this.name = name;
        this.regionId=region.ordinal();
    }
}
