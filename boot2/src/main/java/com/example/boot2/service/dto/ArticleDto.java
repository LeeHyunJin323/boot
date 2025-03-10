package com.example.boot2.service.dto;

import lombok.Data;

@Data
public class ArticleDto {

    private String userId;
    private String title;
    private String body;
    private String imageUrl;
    
    public Article toEntity() {
        return Article.builder()
                .userId(userId)
                .title(title)
                .body(body)
                .imageUrl(imageUrl)
                .build();
    }
}
