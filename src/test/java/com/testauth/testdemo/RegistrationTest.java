package com.testauth.testdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.testauth.testdemo.dao.UserDao;
import com.testauth.testdemo.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RegistrationTest {

    UserDao service;
    User user;
    @BeforeEach
    public void setupUserService() {
        service = new UserDao();
        user = User.builder().username("Phil").password("123").build();
        service.registerNewUser(user);
    }

    @AfterEach
    public void clearInMemDB() {
        User.getUsers().clear();
    }

    @Test
    /**
     * Make sure new user is added to in memory database when first registered
     */
    public void testInMemDB() {
        assertEquals(true, User.getUsers().size() == 1);
    }

    @Test
    public void testValidUserLogin() {
        assertEquals(true, service.authenticateUser(user));
    }

    @Test 
    public void testInvalidUserLogin() {
        User invalidUser = User.builder().username("Fred").password("abc").build();
        assertEquals(false, service.authenticateUser(invalidUser));
    }
    
}
