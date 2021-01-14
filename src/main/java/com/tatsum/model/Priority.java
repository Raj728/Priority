package com.tatsum.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "area")
@EntityListeners(AuditingEntityListener.class)
public class Priority {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String username;
	private Integer connection;
	private Integer relationships;
	private Integer career;
	private Integer wealth;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Integer getConnection() {
		return connection;
	}
	
	public void setConnection(Integer connection) {
		this.connection = connection;
	}
	
	public Integer getRelationships() {
		return relationships;
	}
	
	public void setRelationships(Integer relationships) {
		this.relationships = relationships;
	}
	
	public Integer getCareer() {
		return career;
	}
	
	public void setCareer(Integer career) {
		this.career = career;
	}
	
	public Integer getWealth() {
		return wealth;
	}
	
	public void setWealth(Integer wealth) {
		this.wealth = wealth;
	}
	
}
