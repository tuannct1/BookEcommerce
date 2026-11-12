package com.example.BookEcommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.BookEcommerce.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    
} 