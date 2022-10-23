package com.joyance.lagoon.repository;

import com.joyance.lagoon.model.persisitence.Menu;

public interface MenuRepository {

	public int add(Menu menu);
	
	public int update(Menu menu);
}
