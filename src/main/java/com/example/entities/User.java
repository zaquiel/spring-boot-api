package com.example.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.enums.PerfilEnum;

@Entity
@Table(name="user")
public class User implements Serializable{	

	private static final long serialVersionUID = -7299110009365881310L;
	
	private Long id;
	private String email;
	private String password;
	private PerfilEnum profile;
	
	public User() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="password", nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "profile", nullable = false)
	public PerfilEnum getProfile() {
		return profile;
	}

	public void setProfile(PerfilEnum profile) {
		this.profile = profile;
	}	
 
}
