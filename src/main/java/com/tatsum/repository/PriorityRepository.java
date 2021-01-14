package com.tatsum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatsum.model.Priority;

//Repository
public interface PriorityRepository extends JpaRepository<Priority, Integer>{

}
