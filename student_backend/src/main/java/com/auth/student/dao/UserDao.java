package com.auth.student.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.auth.student.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
