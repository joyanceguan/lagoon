package com.joyance.lagoon.model.persisitence;

import java.util.List;

public class AdminUser extends BaseModel{

	private String code;
	
	private List<Role> roleList;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	
}
