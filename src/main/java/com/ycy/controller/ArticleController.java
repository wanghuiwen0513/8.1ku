package com.ycy.controller;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ycy.bean.Article;
import com.ycy.service.ArticleService;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	@RequestMapping("list")
	public String list(Model model , @RequestParam(name="pageNum",defaultValue = "1") Integer pageNum ,String title, Date startTime,Date endTime) {
		PageHelper.startPage(pageNum,2);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("title", title);
		map.put("startTime", startTime);
		map.put("endTime", endTime);
		List<Article> list = articleService.list(map);
		PageInfo<Article> page  = new PageInfo<Article>(list);
		model.addAttribute("map",map);
		model.addAttribute("page",page);
		return "list";
	}
	
	@RequestMapping("add")
	@ResponseBody
	public Boolean add(Article article) {
		try {
			articleService.insertArticle(article);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}
