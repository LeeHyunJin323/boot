package com.example.boot2.service;

import org.springframework.stereotype.Service;

import com.example.boot2.service.dto.Article;
import com.example.boot2.service.dto.ArticleDto;
import com.example.boot2.service.repository.ArticleRepository;

import lombok.RequiredArgsConstructor;


@Service 
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService{

	
	private final ArticleRepository articleRepository;

	@Override
	public boolean createArticle(ArticleDto articleDto) throws Exception {
		Article toArticle = articleDto.toEntity();
		return articleRepository.save(toArticle) > 0;
	}
	


	

}
