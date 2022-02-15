package org.example;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ThisIsATest {

    String name = "admin";
    String passwd = "123456789";

    @Test
    public void onPasswdUpdate(){
        userService service = new userService();
        assertTrue(service.changePassword(name,passwd));
    }

    @Test
    public void onPasswdFailed(){
        userService service = new userService();
        passwd = "12345";
        assertFalse(service.changePassword(name,passwd));
    }

    @Test
    public void onUserNotExisting(){
        userService service = new userService();
        name = "test";
        assertFalse(service.changePassword(name,passwd));
    }
    @Test
    public void onPasswdUpdateButWrongName(){
        userService service = new userService();
        String name = "admin";
        String passwd = "123456789";
        assertTrue(service.changePassword(name,passwd));
    }
}
