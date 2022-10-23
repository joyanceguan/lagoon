package com.joyance.lagoon.manager.impl;

import javax.inject.Inject;
import javax.inject.Named;

import com.joyance.lagoon.manager.AdminUserManager;
import com.joyance.lagoon.model.persisitence.AdminUser;
import com.joyance.lagoon.repository.AdminUserRepository;

@Named
public class AdminUserManagerImpl implements AdminUserManager{

	@Inject
	AdminUserRepository adminUserRepository;
	
	@Override
	public AdminUser findByCode(String code){
		AdminUser adminUser = adminUserRepository.findByCode(code);
		return adminUser;
	}
}
