package com.brandedcompany.brandedcompany.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "LOCATIONS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Location
{
    @Id
    @GeneratedValue
    @Column(name = "LOCATION_ID")
    private Integer id;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY_ID")
    private Integer countryId;
}
