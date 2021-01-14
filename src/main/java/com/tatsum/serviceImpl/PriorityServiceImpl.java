package com.tatsum.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatsum.DAO.PriorityDAO;
import com.tatsum.model.Priority;
import com.tatsum.service.PriorityService;

@Service
public class PriorityServiceImpl implements PriorityService {
	
	@Autowired
	private PriorityDAO priorityDAO;

	public Priority save(Priority pi) {
		return priorityDAO.save(pi);
	}

	public List<Priority> findAll() {
		return priorityDAO.findAll();
	}

	public Priority findOne(int id) {
		return priorityDAO.findOne(id);
	}
	
	

}
