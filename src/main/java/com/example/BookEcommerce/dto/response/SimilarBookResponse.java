package com.example.BookEcommerce.dto.response;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SimilarBookResponse {
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private Double price;
    private Integer quantity;
    private Integer publishedYear;
    private String categoryName;
    private List<String> authorNames;
    private String publisherName;
    private Double similarity;
}
