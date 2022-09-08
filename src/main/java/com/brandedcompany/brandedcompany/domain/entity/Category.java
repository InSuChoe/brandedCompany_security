package com.brandedcompany.brandedcompany.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIES")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category
{
    @Id
    @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Integer id;
    @Column(name = "CATEGORY_NAME")
    private String name;
}
