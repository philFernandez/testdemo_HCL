package com.testauth.testdemo.model;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private static List<User> users = new ArrayList<>();
    private String username;
    private String password;

    public static void addNewUser(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }

}