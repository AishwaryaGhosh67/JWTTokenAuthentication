package com.auth.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth.student.dao.UserDao;
import com.auth.student.entity.User;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(User user) {

        String password = user.getUserPassword();
        user.setUserPassword(getEncodedPassword(password));

        return userDao.save(user);
    }

    public String getEncodedPassword(String password){

        return passwordEncoder.encode(password);

    }

}
