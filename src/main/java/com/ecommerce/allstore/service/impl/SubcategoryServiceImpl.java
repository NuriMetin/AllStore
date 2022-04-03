package com.ecommerce.allstore.service.impl;

import com.ecommerce.allstore.entity.Subcategory;
import com.ecommerce.allstore.repository.SubcategoryRepository;
import com.ecommerce.allstore.service.inter.SubcategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubcategoryServiceImpl implements SubcategoryService {
    private final SubcategoryRepository subcategoryRepository;

    @Override
    public Subcategory saveSubcategory(Subcategory subcategory) {
        return subcategoryRepository.save(subcategory);
    }
}
