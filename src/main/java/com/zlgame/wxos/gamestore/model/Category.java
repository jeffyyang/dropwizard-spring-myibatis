package com.zlgame.wxos.gamestore.model;

import java.io.Serializable;

public class Category implements Serializable{

	private static final long serialVersionUID = -5107927394961193693L;	
	private int id;
	private String name;
	private String description;
	private int amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
