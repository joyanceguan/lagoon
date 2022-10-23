package com.joyance.lagoon.web.controller;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joyance.lagoon.model.persisitence.AdminUser;
import com.joyance.lagoon.service.AdminUserService;

@RestController
@RequestMapping("/admin")
public class AdminUserController {

	@Inject
	AdminUserService adminUserService;
	
	@RequestMapping(value="/findByCode")
	public AdminUser findByCode(String code){
		return adminUserService.findByCode(code);
	}
	
}
