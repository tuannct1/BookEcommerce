package com.example.BookEcommerce.mapper;

import com.example.BookEcommerce.dto.request.AuthorRequestDTO;
import com.example.BookEcommerce.dto.response.AuthorResponseDTO;
import com.example.BookEcommerce.entity.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {

    public Author toEntity(AuthorRequestDTO request) {
        Author author = new Author();
        author.setName(request.getName());
        return author;
    }

    public void updateEntity(Author author, AuthorRequestDTO request) {
        author.setName(request.getName());
    }

    public AuthorResponseDTO toResponse(Author author) {
        return new AuthorResponseDTO(author.getId(), author.getName());
    }
}
