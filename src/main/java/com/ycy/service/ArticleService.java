package com.ycy.service;

import java.util.List;
import java.util.Map;

import com.ycy.bean.Article;

public interface ArticleService {
	
	public List<Article> list(Map<String, Object> map);

	public void insertArticle(Article article);
}
