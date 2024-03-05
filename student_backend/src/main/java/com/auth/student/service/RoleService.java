package com.auth.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.student.dao.RoleDao;
import com.auth.student.entity.Role;

@Service
public class RoleService {

	@Autowired
	private RoleDao roledao;

	public Role createNewRole(Role role) {

		return roledao.save(role);
	}
}
