package com.testauth.testdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.testauth.testdemo.model.User;
import org.junit.jupiter.api.Test;
  
public class ModelTest {
   @Test
   public void testModel() {
       User user = User.builder().username("Phil").password("123").build();
       assertEquals(true, user.getUsername().equals("Phil"));
       assertEquals(true, user.getPassword().equals("123"));
   }

   @Test
   public void testModelCollection() {
       User user = User.builder().username("Phil").password("123").build();
       User.addNewUser(user);
       assertEquals(true, User.getUsers().size() == 1);
       assertEquals(true, User.getUsers().get(0).getUsername().equals("Phil"));
       assertEquals(true, User.getUsers().get(0).getPassword().equals("123"));
   }
}
