package com.zlgame.wxos.gamestore.model;

import java.io.Serializable;

public class Product implements Serializable{

	private static final long serialVersionUID = -5107927394961193693L;
	
	private int id;           // 题目标识 
	private int categoryId;   // 类别标识
	private String key;       // 正确答案
	private int wordNum;      // 正确答案的字数
	private String otherAnswer;    // 答案
	private String tip;      // 提示
	private int points;       // 题目的点数
	private int task;         // 大关卡
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
		
	public int getWordNum() {
		return wordNum;
	}
	public void setWordNum(int wordNum) {
		this.wordNum = wordNum;
	}
	public String getOtherAnswer() {
		return otherAnswer;
	}
	public void setOtherAnswer(String otherAnswer) {
		this.otherAnswer = otherAnswer;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getTask() {
		return task;
	}
	public void setTask(int task) {
		this.task = task;
	}
	
}
