package com.joyance.lagoon.manager;

import com.joyance.lagoon.model.persisitence.AdminUser;

public interface AdminUserManager {

	public AdminUser findByCode(String code);
	
}
