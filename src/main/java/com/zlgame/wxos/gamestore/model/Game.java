package com.zlgame.wxos.gamestore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game implements Serializable{

	private static final long serialVersionUID = -5107927394961193693L;
	private String id;
	private String name;       
	private String thumbnailUrl;       
	private String url;
	private String categories;
	private String author; // 作者，开发商
	private String provider; // 发行商
	
	private List<GameImage> images  = null;
	private List<Comment> comments = null;

	private int hot;
	private int rank;          
	private String description;
	private int status;
	private Date publishDate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public List<GameImage> getImages() {
		if(images == null)
			images = new ArrayList<GameImage>();
		return images;
	}
	public void setImages(List<GameImage> images) {
		this.images = images;
	}
	public List<Comment> getComments() {
		if(comments == null)
			comments = new ArrayList<Comment>(); 
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
