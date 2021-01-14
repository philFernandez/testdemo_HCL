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
        for (User u : users()) {
            if (u.getUsername().equals(user.getUsername())
                    && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<User> users() {
        return User.getUsers();
    }
}
