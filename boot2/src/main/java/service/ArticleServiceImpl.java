package service;

import org.springframework.stereotype.Service;

import Repository.ArticleRepository;
import dto.Article;
import dto.ArticleDto;
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
