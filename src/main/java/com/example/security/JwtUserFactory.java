package com.example.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.example.entities.User;
import com.example.enums.PerfilEnum;

public class JwtUserFactory {
	
	public JwtUserFactory() {
		
	}

	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), 
				mapToGrantedAuthorities(user.getProfile()));
	}
	
	private static List<GrantedAuthority> mapToGrantedAuthorities(PerfilEnum profile) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(profile.toString()));
		return authorities;
	}
}
