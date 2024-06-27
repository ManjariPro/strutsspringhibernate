package com.example.service;

import com.example.model.User;
import com.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;
    public String getMessage() {
        return "Hello from Struts 2.5, Hibernate 5.3.4 And Spring 5.3.10, WELCOME TO USER MANAGEMENT\";";
    }

    public List<User> getUserList() {

        return userDao.listUsers();
    }

    public void saveUser(User user) {

        userDao.saveUser(user);
    }
}