package com.java.kiemtra.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

        @Id
        @NotNull
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Column(name = "productName")
        private String productName;

        @Column(name = "quantity")
        private Long quantity;

        @ManyToOne
        @JoinColumn(name = "category")
        private Category category;

        public Product() {
        }

        public Product(int id, String productName, Long quantity) {
                this.id = id;
                this.productName = productName;
                this.quantity = quantity;
        }

        @Override
        public String toString() {
                return "Product{" +
                        "id=" + id +
                        ", productName='" + productName + '\'' +
                        ", quantity=" + quantity +
                        '}';
        }
}
