package com.tatsum.DAO;

import java.util.List;

import com.tatsum.model.Priority;

public interface PriorityDAO {
	
	public Priority save(Priority pi);
	
	public List<Priority> findAll();
	
	public Priority findOne(int id);

}
