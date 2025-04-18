package com.ecommerce.treeseller.model;

import com.ecommerce.treeseller.enums.CategoryStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, columnDefinition = "VARCHAR(200)")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String image;

    private CategoryStatus status;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<Product> products;
}
