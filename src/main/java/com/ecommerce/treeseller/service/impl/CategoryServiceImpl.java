package com.ecommerce.treeseller.service.impl;

import com.ecommerce.treeseller.model.Category;
import com.ecommerce.treeseller.repository.CategoryRepository;
import com.ecommerce.treeseller.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
