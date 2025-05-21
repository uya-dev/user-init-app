package com.uy.user.init;

import com.uy.user.init.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    public AppRunner() {
        System.out.println("born app runner");
    }

    @Override
    public void run(String... args) {
        if(!userService.saveToDB()) {
            return;
        }
        System.out.println("Users saved.");
        System.out.println("Users count: " + userService.getUsersCount());
        System.out.println("Users: " + userService.getAllUsers());
        System.out.println("User 1: " + userService.getUser(1L));
        System.out.println("User 3: " + userService.getUser(3L));
        System.out.println("User 8: " + userService.getUser(8L));
    }

}
