package com.ycy.bean;

public class Article {

	private Integer aid;
	private String title;
	private String context;
	private Integer status;
	private String created;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Article [aid=" + aid + ", title=" + title + ", context=" + context + ", status=" + status + ", created="
				+ created + "]";
	}
	public Article(Integer aid, String title, String context, Integer status, String created) {
		super();
		this.aid = aid;
		this.title = title;
		this.context = context;
		this.status = status;
		this.created = created;
	}
	public Article() {
		super();
	}
	
	
}
