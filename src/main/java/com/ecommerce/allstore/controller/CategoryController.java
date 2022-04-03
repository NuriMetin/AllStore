package com.ecommerce.allstore.controller;

import com.ecommerce.allstore.entity.Category;
import com.ecommerce.allstore.service.inter.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Category>> getAllCategories(){
        return ResponseEntity.ok().body(categoryService.getAllCategories());
    }


}
