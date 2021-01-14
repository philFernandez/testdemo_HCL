package com.testauth.testdemo.dao;

import java.util.List;
import com.testauth.testdemo.model.User;

public interface Dao {
    void registerNewUser(User user);
    boolean authenticateUser(User user);
    List<User> users();
}
