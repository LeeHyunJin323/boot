package com.example.boot2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot2.service.ArticleServiceImpl;
import com.example.boot2.service.dto.ArticleDto;
import com.example.boot2.service.dto.CMRespDto;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ReqController {

	
	private final ArticleServiceImpl articleService;
	
	// createArticle(user_id , title , body , image_url) -> 게시글 작성
	
	
	@PostMapping("/create")
	public ResponseEntity<?> createArticle(@RequestBody  ArticleDto articleDto)
	{
		boolean result = false;
		
		try {
			result = articleService.createArticle(articleDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseEntity.ok().body(new CMRespDto<>(-1,"작성 실패" ,result));
		}
		
		return ResponseEntity.ok().body(new CMRespDto<>(1,"작성 성공" ,result));
		 
	}

	
	
}
