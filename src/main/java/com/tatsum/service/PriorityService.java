package com.tatsum.service;

import java.util.List;

import com.tatsum.model.Priority;

public interface PriorityService {
	
	public Priority save(Priority pi);
	
	public List<Priority> findAll();
	
	public Priority findOne(int id) ;
}
