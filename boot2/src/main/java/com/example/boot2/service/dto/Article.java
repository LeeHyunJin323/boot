package com.example.boot2.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Article {

    private String userId;
    private String title;
    private String body;
    private String imageUrl;

}
