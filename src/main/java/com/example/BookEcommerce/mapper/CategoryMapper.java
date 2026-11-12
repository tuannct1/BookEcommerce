package com.example.BookEcommerce.mapper;

import com.example.BookEcommerce.dto.request.CategoryRequest;
import com.example.BookEcommerce.dto.response.CategoryResponse;
import com.example.BookEcommerce.entity.Category;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {

    public Category toEntity(CategoryRequest request) {
        Category category = new Category();
        category.setName(request.getName());
        category.setDescription(request.getDescription());
        return category;
    }

    public void updateEntity(CategoryRequest request, Category category) {
        category.setName(request.getName());
        category.setDescription(request.getDescription());
    }

    public CategoryResponse toResponse(Category category) {
        return new CategoryResponse(category.getId(), category.getName(), category.getDescription());
    }

    public List<CategoryResponse> toResponseList(List<Category> categories) {
        return categories.stream().map(this::toResponse).toList();
    }
}
