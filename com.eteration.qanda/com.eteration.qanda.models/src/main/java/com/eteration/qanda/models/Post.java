package com.eteration.qanda.models;

import java.util.Date;

public class Post {
	User user;
	Date postDate;
	String text;
	Integer rating;
	
	public Post() {
		super();
	}
	public Post(User user, Date postDate, String text, Integer rating) {
		super();
		this.user = user;
		this.postDate = postDate;
		this.text = text;
		this.rating = rating;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
}
