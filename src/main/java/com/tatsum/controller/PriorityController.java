package com.tatsum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tatsum.model.Priority;
import com.tatsum.service.PriorityService;

@RestController
@RequestMapping("/priority")
public class PriorityController {
	
	@Autowired
	private PriorityService priorityService;
	
	
	@PostMapping("/areas")
	public Priority createPriority(@Validated @RequestBody Priority pi) {
		return priorityService.save(pi);
	}
	
	@GetMapping("/areas")
	public List<Priority> getAllPriority(){
		return priorityService.findAll();
	}
	
	@GetMapping("/areas/id")
	public ResponseEntity<Priority> getPriorityById(@PathVariable(value="id") Integer id){
		Priority pi = priorityService.findOne(id);
		if(pi == null) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok().body(pi);
	}
	
	
}
