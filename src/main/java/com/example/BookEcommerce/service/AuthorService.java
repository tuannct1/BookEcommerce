package com.example.BookEcommerce.service;

import com.example.BookEcommerce.dto.request.AuthorRequestDTO;
import com.example.BookEcommerce.dto.response.AuthorResponseDTO;
import com.example.BookEcommerce.entity.Author;
import com.example.BookEcommerce.mapper.AuthorMapper;
import com.example.BookEcommerce.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Transactional
    public AuthorResponseDTO createAuthor(AuthorRequestDTO requestDTO) {
        Author author = authorMapper.toEntity(requestDTO);
        Author savedAuthor = authorRepository.save(author);
        return authorMapper.toResponse(savedAuthor);
    }

    public AuthorResponseDTO getAuthorById(Long id) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy tác giả với id: " + id));
        return authorMapper.toResponse(author);
    }

    public List<AuthorResponseDTO> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(authorMapper::toResponse)
                .collect(Collectors.toList());
    }

    @Transactional
    public AuthorResponseDTO updateAuthor(Long id, AuthorRequestDTO requestDTO) {
        Author author = authorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy tác giả với id: " + id));
        
        authorMapper.updateEntity(author, requestDTO);
        
        Author updatedAuthor = authorRepository.save(author);
        return authorMapper.toResponse(updatedAuthor);
    }

    @Transactional
    public void deleteAuthor(Long id) {
        if (!authorRepository.existsById(id)) {
            throw new RuntimeException("Không tìm thấy tác giả với id: " + id);
        }
        authorRepository.deleteById(id);
    }
}