package com.example.BookEcommerce.mapper;

import com.example.BookEcommerce.dto.request.BookRequest;
import com.example.BookEcommerce.dto.response.BookResponse;
import com.example.BookEcommerce.entity.Book;
import com.example.BookEcommerce.enums.BookStatus;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public Book toEntity(BookRequest request) {
        Book book = new Book();
        updateEntity(request, book);
        return book;
    }

    public void updateEntity(BookRequest request, Book book) {
        book.setTitle(request.getTitle());
        book.setDescription(request.getDescription());
        book.setImageUrl(request.getImageUrl());
        book.setPrice(request.getPrice());
        book.setQuantity(request.getQuantity());
        book.setPublishedYear(request.getPublishedYear());
        book.setStatus(BookStatus.valueOf(request.getStatus().trim().toUpperCase()));
    }

    public BookResponse toResponse(Book book) {
        return new BookResponse(
                book.getId(),
                book.getTitle(),
                book.getDescription(),
                book.getImageUrl(),
                book.getPrice(),
                book.getQuantity(),
                book.getPublishedYear(),
                book.getStatus().name(),
                book.getCategory() == null ? null : book.getCategory().getName(),
                book.getAuthors().stream().map(author -> author.getName()).collect(Collectors.toList()),
                book.getPublisher() == null ? null : book.getPublisher().getName());
    }
}
