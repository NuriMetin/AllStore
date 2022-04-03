package com.ecommerce.allstore;

import com.ecommerce.allstore.entity.Category;
import com.ecommerce.allstore.entity.Role;
import com.ecommerce.allstore.entity.Subcategory;
import com.ecommerce.allstore.entity.User;
import com.ecommerce.allstore.service.inter.CategoryService;
import com.ecommerce.allstore.service.inter.SubcategoryService;
import com.ecommerce.allstore.service.inter.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class AllstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllstoreApplication.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

   // @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new Role(null,"ROLE_USER"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null,"Metin","Nuri","Natiq",
                    "nurimetin98@gmail.com","nurimetin98","1234",0,
                    new Date(System.currentTimeMillis()),null,true, new ArrayList<>()));

            userService.saveUser(new User(null,"Rakif","Ramazanov","Qabil",
                    "ramazanovrakif98@gmail.com","ramazanovrakif98","1234",0,
                    new Date(System.currentTimeMillis()),null,true, new ArrayList<>()));

            userService.saveUser(new User(null,"Nicat","Yaverli","EliPasa",
                    "yaverlinicat98@gmail.com","yaverlinicat98","1234",0,
                    new Date(System.currentTimeMillis()),null,true, new ArrayList<>()));

            userService.saveUser(new User(null,"Murad","Cahangirli","Islam",
                    "cahangirlimurad98@gmail.com","cahangirlimurad98","1234",0,
                    new Date(System.currentTimeMillis()),null,true, new ArrayList<>()));

            userService.addRoleToUser("yaverlinicat98","ROLE_USER");
            userService.addRoleToUser("cahangirlimurad98","ROLE_USER");
            userService.addRoleToUser("ramazanovrakif98","ROLE_MANAGER");
            userService.addRoleToUser("nurimetin98","ROLE_ADMIN");
            userService.addRoleToUser("nurimetin98","ROLE_SUPER_ADMIN");
            userService.addRoleToUser("nurimetin98","ROLE_MANAGER");
        };
    }


    // @Bean
    CommandLineRunner run(CategoryService categoryService,SubcategoryService subcategoryService){
        return args->{
            Category category1=new Category();
            category1.setName("Elektronika");

            Category category2=new Category();
            category2.setName("Geyim");

            Category category3=new Category();
            category3.setName("Məişət");

            Category category4=new Category();
            category4.setName("Mebel");

            categoryService.saveCategory(category1);
            categoryService.saveCategory(category2);
            categoryService.saveCategory(category3);
            categoryService.saveCategory(category4);

            Subcategory subcategory=new Subcategory();

            Category category = categoryService.getCategoryById(1L);


            subcategory.setName("Kpmpyuter");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);


            subcategory=new Subcategory();
            subcategory.setName("Smartfon");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Planset");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Smart saat");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            category = categoryService.getCategoryById(2L);

            subcategory=new Subcategory();
            subcategory.setName("Salvar");
            categoryService.saveSubcategory(2L,subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Koynək");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Palto");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            category = categoryService.getCategoryById(3L);

            subcategory=new Subcategory();
            subcategory.setName("Soyuducu");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Paltaryuyan");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Qabyuyan");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Aspirator");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Soba");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            category = categoryService.getCategoryById(4L);

            subcategory=new Subcategory();
            subcategory.setName("Mətbəx mebeli");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Yataq mebeli");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);

            subcategory=new Subcategory();
            subcategory.setName("Qonaq mebeli");
            subcategory.setCategory(category);
            subcategoryService.saveSubcategory(subcategory);
        };
    }
}
