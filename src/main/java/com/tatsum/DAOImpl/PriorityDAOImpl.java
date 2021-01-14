package com.tatsum.DAOImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tatsum.DAO.PriorityDAO;
import com.tatsum.model.Priority;
import com.tatsum.repository.PriorityRepository;


//DAO class
@Repository
public class PriorityDAOImpl implements PriorityDAO {
	
	@Autowired
	PriorityRepository repository;
	
	public Priority save(Priority pi) {
		return repository.save(pi);
	}
	
	public List<Priority> findAll() {
		return repository.findAll();
	}
	
	public Priority findOne(int id) {
		Optional<Priority> opt = repository.findById(id);
		
		return opt.get();
	}

}
