package com.ecommerce.allstore.service.impl;

import com.ecommerce.allstore.entity.Category;
import com.ecommerce.allstore.entity.Subcategory;
import com.ecommerce.allstore.repository.CategoryRepository;
import com.ecommerce.allstore.service.inter.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;


    @Override
    public List<Category> getAllCategories(){
       List<Category> categories=categoryRepository.findAll();

       if(categories==null){
           log.error("Categorise not found");
       }
       else{
           log.info("Categories found: {}",categories);
       }

       return categories;
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public void saveSubcategory(Long categoryId,Subcategory subcategory) {
        Category category=categoryRepository.findById(categoryId).get();
        //category.getSubcategories().add(subcategory);

    }
}
