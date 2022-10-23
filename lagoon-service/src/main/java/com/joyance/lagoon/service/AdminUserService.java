package com.joyance.lagoon.service;

import com.joyance.lagoon.model.persisitence.AdminUser;

public interface AdminUserService {

	public AdminUser findByCode(String code);
	
}
