package com.joyance.lagoon.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.joyance.lagoon.manager.AdminUserManager;
import com.joyance.lagoon.model.persisitence.AdminUser;
import com.joyance.lagoon.service.AdminUserService;

@Named
public class AdminUserServiceImpl implements AdminUserService{

	@Inject
	AdminUserManager adminUserManager;
	
	@Override
	public AdminUser findByCode(String code) {
		return adminUserManager.findByCode(code);
	}

}
