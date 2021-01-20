package com.yeg.test.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个菜单类
 */
public class Menu {

	int id;
	String name;
	List<Menu> children = new ArrayList<Menu>();

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

	public void addChild(Menu menu) {
		this.children.add(menu);
	}

	public List<Menu> getChildren() {
		return children;
	}
}
