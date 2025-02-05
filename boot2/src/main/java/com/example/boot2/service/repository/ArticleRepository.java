package com.example.boot2.service.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.boot2.service.dto.Article;



@Mapper
public interface ArticleRepository {
	public int save(Article article) throws Exception;
	
	

}
