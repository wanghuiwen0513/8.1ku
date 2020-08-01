package com.ycy.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ycy.bean.Article;
import com.ycy.mapper.ArticleMapper;
@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleMapper mapper;
	@Override
	public List<Article> list(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.list(map);
	}
	@Override
	public void insertArticle(Article article) {
		// TODO Auto-generated method stub
		mapper.insertArticle(article);
	}

}
