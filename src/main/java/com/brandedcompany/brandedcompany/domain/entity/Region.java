package com.brandedcompany.brandedcompany.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "REGIONS")
@AllArgsConstructor
public class Region
{
    @Id
    @GeneratedValue
    @Column(name = "REGION_ID")
    private Integer id;

    @Column(name = "REGION_NAME")
    private String name;

    public Region(REGION region)
    {
        this.id = region.ordinal();
        this.name = region.name();
    }

    public Region()
    {
        throw new NullPointerException();
    }

    @Getter
    public enum REGION
    {
        EUROPE,AMERICAS,ASIA,MIDDLE_EAST,AFRICA;

    }
}
