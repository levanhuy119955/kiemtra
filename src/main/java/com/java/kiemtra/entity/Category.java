package com.java.kiemtra.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "categoryName")
    private String categoryName;

    @OneToMany(mappedBy = "category")
    private Product product;

    public Category() {
    }

    public Category(int id, String categoryName, Product product) {
        this.id = id;
        this.categoryName = categoryName;
        this.product = product;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", product=" + product +
                '}';
    }
}
