package cn.lch.entity;

import org.springframework.stereotype.Component;

@Component
public class Goods {
	private int id;
	private String name;
	private int price;
	private int c_id;
	private String redis_id;
	
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getRedis_id() {
		return redis_id;
	}
	public void setRedis_id(String redis_id) {
		this.redis_id = redis_id;
	}
	
	
}
