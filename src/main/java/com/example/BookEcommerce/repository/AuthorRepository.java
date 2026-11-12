package com.example.BookEcommerce.repository;

import com.example.BookEcommerce.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}