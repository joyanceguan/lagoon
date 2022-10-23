package com.joyance.lagoon.model.persisitence;

import java.util.List;

public class Role extends BaseModel{

	/**
	 * 角色名称
	 */
	private String name;
	
	/**
	 * 角色编码
	 */
	private String code;
	
	/**
	 * 菜单列表
	 */
	private List<Menu> menuList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
}
