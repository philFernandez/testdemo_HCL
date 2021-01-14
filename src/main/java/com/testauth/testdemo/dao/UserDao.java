package com.testauth.testdemo.dao;

import java.util.List;
import com.testauth.testdemo.model.User;
import org.springframework.stereotype.Service;


@Service
public class UserDao implements Dao {
    public void registerNewUser(String username, String password) {
        User user = new User(username, password);
        User.addNewUser(user);
    }

    @Override
    public void registerNewUser(User user) {
        registerNewUser(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean authenticateUser(User user) {
        return false;
    }

    @Override
    public List<User> users() {
        return User.getUsers();
    }
}
