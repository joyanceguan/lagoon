package com.joyance.lagoon.service;

import javax.inject.Inject;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.joyance.lagoon.BaseTest;
import com.joyance.lagoon.model.persisitence.AdminUser;

public class AdminUserServiceTest extends BaseTest{

	@Inject
	AdminUserService adminUserService;
	
	@Test
	public void test_findByCode(){
		AdminUser adminUser = adminUserService.findByCode("guanyue");
		System.out.println(JSON.toJSONString(adminUser));
	}
}
