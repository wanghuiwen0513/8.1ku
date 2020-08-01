package com.ycy.mapper;

import java.util.List;
import java.util.Map;

import com.ycy.bean.Article;

public interface ArticleMapper {

	public List<Article> list(Map<String, Object> map);
	public void insertArticle(Article article);
	
}
