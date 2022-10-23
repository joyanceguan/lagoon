package com.joyance.lagoon.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.joyance.lagoon.model.persisitence.AdminUser;

@Mapper
public interface AdminUserRepository {

	@Insert("insert into admin_user (code,create_time,update_time,create_by,update_by,status) values (#{code},#{createTime},#{updateTime},#{createBy},#{updateBy},#{status})")
	public int add(AdminUser adminUser);
	
//	@Select("select id,code,create_time,update_time,create_by,update_by,status from admin_user")
	public AdminUser findByCode(String code);
	
}
