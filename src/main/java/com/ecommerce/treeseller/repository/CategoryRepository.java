package com.ecommerce.treeseller.repository;

import com.ecommerce.treeseller.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
