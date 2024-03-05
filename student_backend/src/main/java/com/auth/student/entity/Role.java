package com.auth.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	private String roleName;
	private String roleDecription;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDecription() {
		return roleDecription;
	}

	public void setRoleDecription(String roleDecription) {
		this.roleDecription = roleDecription;
	}

}
