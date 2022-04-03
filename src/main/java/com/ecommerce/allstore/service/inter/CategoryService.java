package com.ecommerce.allstore.service.inter;

import com.ecommerce.allstore.entity.Category;
import com.ecommerce.allstore.entity.Subcategory;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category saveCategory(Category category);
    Category getCategoryById(Long id);
    void saveSubcategory(Long categoryId,Subcategory subcategory);
}
